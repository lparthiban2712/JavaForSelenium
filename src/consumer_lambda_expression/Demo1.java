package consumer_lambda_expression;

import java.util.function.Consumer;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consumer<Integer>c=n->System.out.println(n);
		c.accept(5);
		c.accept(6);

	}

}
