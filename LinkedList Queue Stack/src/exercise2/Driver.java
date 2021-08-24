package exercise2;

public class Driver {
	public static void main(String args[]) {
		stack stack1 = new stack(10);
		stack1.push(1);
		stack1.push(2);
		stack1.push(3);
		stack1.push(4);
		System.out.println(stack1.pop() + " Popped from stack");
		stack stack2 = new stack(10);
		stack2.push(5);
		stack2.push(6);
		stack2.push(7);
		stack2.push(8);
		stack2.display();
		transfer(stack1, stack2);
		stack2.display();

	}

	public static void transfer(stack stack1, stack stack2) {
		while (stack1.top >= 0) {

			stack2.push(stack1.pop());

		}
	}
}
