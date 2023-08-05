package java_streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Matches {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String>elements=Arrays.asList("Banana","Orange","Apple","Lemon","Biscuit");
		boolean result=elements.stream().anyMatch(value->
		{return value.startsWith("B");});
		System.out.println(result);
		
		boolean result2=elements.stream().allMatch(value->
		{return value.startsWith("B");});
		System.out.println(result2);
		
		boolean result3=elements.stream().noneMatch(value->
		{return value.startsWith("B");});
		System.out.println(result3);
		
		List<String>elements1=Arrays.asList("Banana","Orange","Apple","Lemon","Biscuit");
		List<String>elements2=Arrays.asList("Banana2","Orange2","Apple2","Lemon2","Biscuit2");
		
		Stream<String>stream1=elements1.stream();
		Stream<String>stream2=elements2.stream();
		List<String>finalList=Stream.concat(stream1, stream2).collect(Collectors.toList());
		System.out.println(finalList);
		
	}

}
