package java_streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String>names=Arrays.asList("Parthi","Devnath","Priya","Hemanth");
		List<String>longnames=new ArrayList<String>();
		longnames=names.stream().filter(n->n.length()>5).collect(Collectors.toList());
		System.out.println(longnames);
		
		

	}

}
