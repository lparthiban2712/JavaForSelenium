package java_programs;

public class ControlStatements {

	public static void main(String[] args)
	{
		int a=5;
		
		if(a==5)
		{
			System.out.println("a is 5");
		}
		
		else if(a==6)
		{
			System.out.println("a is 6");
		}
		
		else
		{
			System.out.println("a is NOT 5, 6");
		}
		
		int age=31;
		
		switch(age)
		{
		case 17:
			System.out.println("Not eligible for vote");
			break;
		case 18:
			System.out.println("eligible for vote");
			break;
		case 30:
			System.out.println("eligible for vote");
			break;
		default:
			System.out.println("age is NOT 17,18,30");
			
		}
	}
}
