package predicates_example;

import java.util.function.Predicate;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Predicate<String>p=i->(i.length()>4);
		
		
		System.out.println(p.test("Ravi"));
		System.out.println(p.test("Ravikumar"));

	}

}
