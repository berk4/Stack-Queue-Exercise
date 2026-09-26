public class Stack {
    private final Object[] elements;
    private int top;

    public Stack(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("Capacity must be greater than zero.");
        }

        elements = new Object[capacity];
        top = -1;
    }

    public void push(Object data) {
        if (isFull()) {
            throw new IllegalStateException("Stack is full.");
        }

        top++;
        elements[top] = data;
    }

    public Object pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty.");
        }

        Object removedElement = elements[top];
        elements[top] = null;
        top--;
        return removedElement;
    }

    public Object peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty.");
        }

        return elements[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top + 1 == elements.length;
    }

    public int size() {
        return top + 1;
    }
}
