package java_streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class mapExample2 {
	
	String name;
	int salary;
	
	mapExample2(String name, int salary)
	{
		this.name=name;
		this.salary=salary;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<mapExample2>employees=Arrays.asList(
				(new mapExample2("parthi",10000)),
				(new mapExample2("priya",20000)),
				(new mapExample2("dev",30000)),
				(new mapExample2("hem",40000))				
				);
		
		List<String>names=employees.stream().filter(e->e.salary>10000).map(e->e.name).collect(Collectors.toList());
		System.out.println(names);
		
		

	}

}
