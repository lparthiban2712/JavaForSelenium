package frequently_asked_java_programs;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=6;
		int fact=1;
		
		for(int i=num;i>=2;i--)
		{
			fact=fact*i;
			
		}
		System.out.println(fact);

	}

}
