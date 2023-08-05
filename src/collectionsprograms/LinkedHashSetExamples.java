package collectionsprograms;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Duplicates are not added to the set, insertion order is  maintained
		
		LinkedHashSet<Object> hs=new LinkedHashSet<Object>();
		hs.add('A');
		hs.add('B');
		hs.add(null);
		hs.add('A');
		hs.add(null);
		System.out.println(hs);
		
		

	}

}
