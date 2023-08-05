package java_streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Terminal_And_Non_Terminal_Functions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer>numbers=Arrays.asList(1,11,3,67,54,89,75,67);
		System.out.println(numbers.stream().count());
		numbers.stream().distinct().forEach(n->System.out.println(n));
		numbers.stream().distinct().limit(4).forEach(n->System.out.println(n));
		Optional<Integer>minvalue=numbers.stream().min((val1,val2)->
		{
			return val1.compareTo(val2);
		});
		System.out.println(minvalue.get());
	
	
	Optional<Integer>maxvalue=numbers.stream().max((val1,val2)->
	{
		return val1.compareTo(val2);
	});
	System.out.println(maxvalue.get());
	
	List<String>initialList=Arrays.asList("one","parthi","two","priya");
	Optional<String>finalList=initialList.stream().reduce((value,combined)->
	{
		return combined+value;
	});
	System.out.println(finalList.get());
	
	Object[]arr=initialList.stream().toArray();
	System.out.println(arr.length);
	for(Object a:arr)
	{
		System.out.println(a);
	}
}
}

