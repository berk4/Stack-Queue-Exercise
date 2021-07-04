
public class Main {

	public static void main(String[] args) {
		Stack s1 = new Stack(5);
		
		s1.push(6);
		s1.push(7);
		s1.push(8);
		
		System.out.println(s1.peek());
		
		s1.pop();
		
		System.out.println(s1.peek());
		System.out.println("S1 length : " + s1.size());
		System.out.println();
		
		Queue q1 = new Queue(10);
		
		q1.enqueue(1);
		q1.enqueue(2);
		q1.enqueue(3);
		
		System.out.println(q1.peek());
		System.out.println(q1.size());
		System.out.println(q1.dequeue());
		System.out.println(q1.size());
		

	}

}
