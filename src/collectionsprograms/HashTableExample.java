package collectionsprograms;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class HashTableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hashtable<Object,Object> hm=new Hashtable<Object,Object>();
		hm.put(1, "Apple");
		hm.put(2, "orange");
		hm.put(3, "Donkey");
		hm.put(4, "hero");
		//hm.put(null, "zero");//null key not accepted
		//hm.put(8,null);//null key not accepted
		System.out.println(hm);
		System.out.println(hm.containsKey(2));
		System.out.println(hm.containsValue("hero"));
		System.out.println(hm.keySet());
		System.out.println(hm.values());
		for(Object V:hm.keySet())
		{
			System.out.println(V+":"+hm.get(V));
		}
		
		for(Map.Entry entry:hm.entrySet())
		{
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}

}
