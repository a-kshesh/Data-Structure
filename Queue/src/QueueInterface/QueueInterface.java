package QueueInterface;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class QueueInterface {
	
	public static void main(String[] args)
	{  Random rand=new Random();
	Queue<Integer> q= new LinkedList();
		for(int i=0;i<5;i++)
		{int j=rand.nextInt(9);
			
			q.add(j);
		}
		
		System.out.println(""+q);
		int i= q.remove();
		System.out.println(""+q);
		System.out.println("the size is "+q.size());
		System.out.println("the peek is "+q.peek());
	}
}
