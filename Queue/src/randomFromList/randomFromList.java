package randomFromList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class randomFromList {

	public static void main(String[] args)
	{
		ArrayList<String> l=new ArrayList();
		l.add("1");
		l.add("2");
		l.add("4");
		l.add("5");
		System.out.println("List"+l);
		
		System.out.println("Removed element "+l.remove(2));
		for (String string : l) {
			System.out.println(" "+string);
		}
		
		
		System.out.println(" list Iterator");
		ListIterator<String> li=l.listIterator();
		while(li.hasNext())
		{
			System.out.println(" "+li.next());
		}
		
	
		li.remove();
		li.add("7");
		
		
		System.out.println();
		while(li.hasPrevious())
		{
			System.out.println(""+li.previous());
		}
		
	}
}
