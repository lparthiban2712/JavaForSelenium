package java_streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer>numbers=Arrays.asList(10,15,20,25,30,35,40);
		List<Integer>evennumbers=new ArrayList<Integer>();
		evennumbers=numbers.stream().filter(n->n%2==0).collect(Collectors.toList());
		System.out.println(evennumbers);
		numbers.stream().filter(n->n%2!=0).forEach(n->System.out.println(n));
		numbers.stream().filter(n->n%2!=0).forEach(System.out::println);
		

	}

}
