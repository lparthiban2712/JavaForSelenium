package consumer_lambda_expression;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Employee {
	
	String name;
	int salary;
	
	Employee(String name, int salary)
	{
		this.name=name;
		this.salary=salary;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<Integer>p=b->b>1000;
		Function<Employee,Integer>f=e->
		{
			int salary=e.salary;
			if (salary<=4000)
			{
				return (salary* 10/100);
			}
			else
			{
				return (salary* 20/100);
			}
		};
		Consumer<Employee>c=b->System.out.println(b.name);
		
		ArrayList<Employee>al=new ArrayList<Employee>();
		al.add(new Employee("Parthi",3000));
		al.add(new Employee("Priya",4000));
		al.add(new Employee("Dev",5000));
		al.add(new Employee("Hem",6000));
		
		for(Employee e:al)
		{
			int bonus=f.apply(e);
			if(p.test(bonus))
			{
				c.accept(e);
				}
		}
		
		

	}

}
