package collectionsprograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListProgram {
	
	
	public static void main(String[] args)
	{
		ArrayList<String> al=new ArrayList<String>();
		al.add("Mango");
		al.add("Apple");
		al.add("orange");
		al.add("PineAppple");
		
		System.out.println(al);
		al.add(3, "Banana");
		System.out.println(al);
		System.out.println(al.contains("Mango"));
		al.remove(0);
		System.out.println(al);
		System.out.println(al.get(2));
		
		for(int i=0;i<al.size();i++)
{
			System.out.println(al.get(i));
}
		for(Object a:al)
		{
			System.out.println(a);
		}
		
		Iterator<String> it=al.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		ArrayList<String> bl=new ArrayList<String>();
		bl.addAll(al);
		System.out.println("bl array list is"+bl);
		Collections.sort(bl);
		System.out.println(bl);
		if(al.equals(bl))
			
		{
			System.out.println("two array list are same");
		}
		
		String[] Vegetables= {"Pumpkin","Bitter Gourd", "Tomato", "Potato"};
		
		ArrayList<String>cl=new ArrayList<String>(Arrays.asList(Vegetables));
		System.out.println(cl);
		Object[]d=cl.toArray();
		System.out.println(d[2]);
		bl.set(2, "Ladies Finger");
		System.out.println(bl);
		bl.add(null);
		bl.add(null);
		System.out.println(bl);
		
		System.out.println(bl.contains("brinjal"));
		System.out.println(bl.isEmpty());
		bl.remove(null);
		bl.remove(null);
		Collections.sort(bl,Collections.reverseOrder());
		System.out.println(bl);
		
		
		
		
	}

}
