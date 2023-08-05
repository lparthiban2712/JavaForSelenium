package java_streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class mapExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String>names=Arrays.asList("parthi","devnath","priya","hemanth");
		List<String>capitalnames=new ArrayList<String>();
		capitalnames=names.stream().map(n->n.toUpperCase()).collect(Collectors.toList());
		System.out.println(capitalnames);
		
		

	}

}
