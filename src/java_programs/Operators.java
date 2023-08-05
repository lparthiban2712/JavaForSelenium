package java_programs;

public class Operators {

	public void arithematicoperators(int a, int b)
	{
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
	}
	
	public void relationaloperators(int a, int b)
	{
		System.out.println(a==b);
		System.out.println(a!=b);
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a>=b);
		System.out.println(a<=b);
		
	}
	public void logicaloperators(int a, int b)
	{
		if ((a==10)&&(a>b))
		{
			System.out.println("a is 10 and also greater than b");
		}
		
		if ((a==9)||(a>b))
		{
			System.out.println("a is 9 or greater than b");
		}
		
		if (!(a==9))
		{
			System.out.println("a is NOT 9");
		}
	
	}
	
	public void increment(int a)
	{
		System.out.println(a);//10
		System.out.println(a++);//10
		System.out.println(a);//11
		System.out.println(++a);//12
	}
	
	public void decrement(int a)
	{
		System.out.println(a);//10
		System.out.println(a--);//10
		System.out.println(a);//9
		System.out.println(--a);//8
	}
	public static void main(String[] args)
	{
		Operators ob=new Operators();
		ob.arithematicoperators(10, 5);
		ob.relationaloperators(10, 5);
		ob.logicaloperators(10, 5);
		ob.increment(10);
		ob.decrement(10);
	}
	
	
}
