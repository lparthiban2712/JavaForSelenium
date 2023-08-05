package collectionsprograms;

import java.util.PriorityQueue;

public class PriorityQueueExamples {

	public static void main(String[] args)
	{
		PriorityQueue pq=new PriorityQueue();//insertion oder is maintained, duplicates are allowed
		pq.add("Apple");
		pq.add("brinjal");
		//pq.offer('f');//cannot add hetrogeneous data
		//pq.offer("mango");
		System.out.println(pq);
		pq.add("Orange");
		pq.add("Gauva");
		pq.add("muskmelon");
		pq.add("muskmelon");
		System.out.println(pq);
		System.out.println(pq.element());//throws Exception if queue is empty
		System.out.println(pq.peek());//throws null if queue is empty
		
		System.out.println(pq.remove());//throws Exception if queue is empty
		System.out.println(pq.poll());//throws null if queue is empty
		System.out.println(pq);
		pq.clear();
		System.out.println(pq.poll());//null
		System.out.println(pq.remove());//exception
	}
}
