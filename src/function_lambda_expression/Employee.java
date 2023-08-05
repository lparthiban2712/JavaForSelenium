package function_lambda_expression;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

public class Employee {
	
	String name;
	double salary;
	
	Employee(String name, double salary)
	{
		this.name=name;
		this.salary=salary;
		
	}

	public static void main(String[] args) {
				
		Function<Employee,Double>f=e->{
			double salary=e.salary;
			if(salary>1500 && salary<1000) {
				return (salary * 10/100);
			}
			
			else
				return (salary * 20/100);
		};
		Predicate<Double>p=b->b>3000;
		ArrayList<Employee>al=new ArrayList<Employee>();
		al.add(new Employee("parthi",2500));
		al.add(new Employee("dev",5000));
		al.add(new Employee("hem",6000));
		al.add(new Employee("hem",7000));
		
		for(Employee e:al)
		{
			double bonus=f.apply(e);
			System.out.println(bonus);
			
			  if(p.test(bonus)) { System.out.println(e.name+":"+bonus); }
			 
		}
		

	}

}
