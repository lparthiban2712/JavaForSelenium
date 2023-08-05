package function_lambda_expression;

import java.util.function.Function;

public class FunctionChaining {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function<Integer,Integer>f1=n->n*n;
		Function<Integer,Integer>f2=n->n*n*n;
		
		System.out.println(f1.andThen(f2).apply(2));
		System.out.println(f1.compose(f2).apply(3));
		
	}

}
