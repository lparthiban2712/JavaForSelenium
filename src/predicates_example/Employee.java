package predicates_example;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Employee {
	String name;
	double salary;
	int exp;
	
	Employee(String name, double salary,int exp)
	{
		this.name=name;
		this.salary=salary;
		this.exp=exp;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee>al=new ArrayList<Employee>();
		
		al.add(new Employee("Raj",2000,2));
		al.add(new Employee("Raju",3000,3));
		al.add(new Employee("Rajubhai",4000,4));
		al.add(new Employee("Rajkiran",5000,5));
		
		Predicate<Employee>p=e->(e.salary>2500 && e.exp>3);
		Predicate<Employee>p1=e->(e.salary>2500);
		Predicate<Employee>p2=e->(e.exp>3);
		
		for(Employee e:al)
		{
			if(p.test(e))
			{
				System.out.println(e.name+":"+e.salary);
			}
		}
		
		for(Employee e:al)
		{
			if(p1.and(p2).test(e))
			{
				System.out.println(e.name+":"+e.salary);
			}
		}
		
		for(Employee e:al)
		{
			if(p1.or(p2).test(e))
			{
				System.out.println(e.name+":"+e.salary);
			}
		}
		for(Employee e:al)
		{
			if(p1.negate().test(e))
			{
				System.out.println(e.name+":"+e.salary);
			}
		}
		

	}

}
