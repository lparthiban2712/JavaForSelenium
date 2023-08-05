package collectionsprograms;

import java.util.LinkedList;

public class LinkedListExamples {
	
	
	public static void main(String[] args)
	{
		LinkedList<Object> li=new LinkedList<Object>();
		li.add(2);
		li.add(4);
		li.add(6);
		li.addFirst(1);
		li.addLast(7);
		System.out.println(li);
		System.out.println(li.get(2));
		System.out.println(li.getFirst());
		System.out.println(li.getLast());
		li.add(null);
		System.out.println(li);
		
	}
	
}


	
	
