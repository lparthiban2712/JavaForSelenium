package frequently_asked_java_programs;

public class NumberReverse {

	public static void main(String[] args)
	{
		int num=321;
		int rev=0;
		
		while(num!=0)
		{
			rev=rev*10;
			rev=rev+num%10;
			num=num/10;
		}
		System.out.println(rev);
	}
}
