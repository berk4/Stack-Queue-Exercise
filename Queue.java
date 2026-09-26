public class Queue {
    private final Object[] elements;
    private int front;
    private int rear;
    private int size;

    public Queue(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("Capacity must be greater than zero.");
        }

        elements = new Object[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    public void enqueue(Object data) {
        if (isFull()) {
            throw new IllegalStateException("Queue is full.");
        }

        rear = (rear + 1) % elements.length;
        elements[rear] = data;
        size++;
    }

    public Object dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty.");
        }

        Object removedElement = elements[front];
        elements[front] = null;
        front = (front + 1) % elements.length;
        size--;
        return removedElement;
    }

    public Object peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty.");
        }

        return elements[front];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == elements.length;
    }

    public int size() {
        return size;
    }
}
