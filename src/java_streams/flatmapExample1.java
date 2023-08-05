package java_streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class flatmapExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String>names=Arrays.asList("parthi","devnath","priya","hemanth");
		List<String>names2=Arrays.asList("one","two","three","four");
		List<String>names3=Arrays.asList("parthi","devnath","priya","hemanth");
		List<List<String>>allnames=Arrays.asList(names,names2,names3);
		List<String>capitalnames=new ArrayList<String>();
		capitalnames=allnames.stream().flatMap(x->x.stream()).map(n->n.toUpperCase()).collect(Collectors.toList());
		System.out.println(capitalnames);
		
		

	}

}
