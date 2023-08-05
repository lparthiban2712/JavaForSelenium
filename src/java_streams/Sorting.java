package java_streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer>numbers=Arrays.asList(4,2,3,7,1,9,8);
		List<Integer>ascendingorder=numbers.stream().sorted().collect(Collectors.toList());
		List<Integer>descendingorder=numbers.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println("Ascending order= "+ascendingorder);
		System.out.println("Descending order= "+descendingorder);
		Collections.sort(numbers);
		System.out.println(numbers);
		Collections.reverse(numbers);
		System.out.println(numbers);

	}

}
