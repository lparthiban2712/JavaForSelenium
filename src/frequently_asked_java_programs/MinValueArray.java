package frequently_asked_java_programs;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class MinValueArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		List<Integer>minimum=Arrays.asList(3,6,2,8,9,12,5);
		Optional<Integer>min=minimum.stream().min((val1,val2)->
		{
			return val1.compareTo(val2);}
		);
	System.out.println(min.get());	
	
	

	int[]num= {6,3,9,81,2,5};
	int minvalue=num[0];
	
	for(int n:num)
	{
		if(n<minvalue)
		{
			minvalue=n;
		}
	}
	
	System.out.println(minvalue);
	
	Collections.sort(minimum);
	System.out.println(minimum);
	System.out.println(minimum.get(0));
	System.out.println(minimum.get(minimum.size()-1));
}
	
}

