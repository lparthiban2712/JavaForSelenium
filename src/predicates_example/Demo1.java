package predicates_example;

import java.util.function.Predicate;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Predicate<Integer>p=i->(i>10);
		
		
		System.out.println(p.test(19));
		System.out.println(p.test(9));

	}

}
