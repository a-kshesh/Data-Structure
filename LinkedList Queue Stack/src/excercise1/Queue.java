package excercise1;

public class Queue {
	LinkedList First;
	LinkedList Last;

	public Queue() {
		First = null;
		Last = null;
	}

	public void enqueue(int i) {
		LinkedList list = new LinkedList(i);
		if (this.First == null) {
			this.First = list;
			this.Last = list;
			return;
		}
		this.First.Next = list;
		this.Last = list;
	}

	public void dequeue() {
		if (this.First == null) {
			return;
		}
		LinkedList i = this.First;
		this.First = this.First.Next;
		if (this.First == null) {
			this.Last = null;
		}
	}

	public void printQueue() {
		while (First != null) {
			System.out.println(First.Value);
			First = First.Next;
		}
		System.out.println(Last.Value);
	}

}
