package function_lambda_expression;

import java.util.function.Function;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Function<Integer,Integer>f=n->n*n;
		System.out.println(f.apply(2));
		System.out.println(f.apply(8));
		

	}

}
