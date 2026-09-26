public class Main {

    public static void main(String[] args) {
        Stack stack = new Stack(5);

        stack.push(6);
        stack.push(7);
        stack.push(8);

        System.out.println(stack.peek());

        stack.pop();

        System.out.println(stack.peek());
        System.out.println("S1 length : " + stack.size());
        System.out.println();

        Queue queue = new Queue(10);

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.println(queue.peek());
        System.out.println(queue.size());
        System.out.println(queue.dequeue());
        System.out.println(queue.size());
    }
}
