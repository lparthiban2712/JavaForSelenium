package java_programs;

public class ExceptionHandling {

	public static void main(String[] args)
	{
		int a=10;
		
		try
		{
			System.out.println(a/2);
			String s="abc";
			int b=Integer.parseInt(s);
		}
	
		
		
		catch(ArithmeticException e)
		{
			System.out.println("Entered into ArithmeticException catch block");
		}
		catch(NumberFormatException e)
		{
			System.out.println("Entered into NumberFormatException catch block");
		}
		catch(Exception e)
		{
			System.out.println("Entered into General catch block");
		}
		
		finally
		{
			System.out.println("finally block");
		}
	}
}
