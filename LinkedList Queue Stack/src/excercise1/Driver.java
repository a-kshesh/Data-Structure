package excercise1;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue queue = new Queue();
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		queue.enqueue(4);
		queue.enqueue(5);
		//System.out.println(queue.First.Value);
		//queue.printQueue();
		Queue queue2 = new Queue();
		queue2.enqueue(6);
		queue2.enqueue(7);
		queue2.enqueue(8);
		queue2.enqueue(9);
		
		concate(queue,queue2);

	}
	
	public static void concate(Queue q1, Queue q2) {
		Queue list = new Queue();
		while(q1.First!=null) {
			list.enqueue(q1.First.Value);
			q1.First = q1.First.Next;
		}
		while(q2.First!=null) {
			list.enqueue(q2.First.Value);
			q2.First = q2.First.Next;
			//System.out.println(q2.First.Next);
		}
		
	}
	
	public void printQueue(Queue q1, Queue q2) {
		Queue current = q1;
		while (current != null) {
			System.out.print(current.First.Value+" ");
			
		}
		System.out.println();
	}

}
