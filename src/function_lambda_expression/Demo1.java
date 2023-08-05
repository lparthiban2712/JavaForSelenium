package function_lambda_expression;

import java.util.function.Function;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Function<String,Integer>f=s->s.length();
		System.out.println(f.apply("Welcome"));
		System.out.println(f.apply("java"));
		
		

	}

}
