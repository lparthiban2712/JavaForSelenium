package inheritance;

class parthi
{
	int a=50;
	
	parthi()
	{
		System.out.println("parthi constructor");
	}
	
	public void m1()
	{
		System.out.println("This is m1 method in parthi class");
		
	}
}

class dev extends parthi
{
	int a=10;
	
	dev()
	{
		System.out.println("dev constructor");
	}
	
	public void m1()
	
	{
		super.m1();
		System.out.println(super.a);
		System.out.println("This is m1 method in dev class");
		
	}
}

class hem extends dev
{
	int a=20;
	hem()
	{
		super();
		System.out.println("hem constructor");
	}
	public void m1()
	{
		
		System.out.println(super.a);
		super.m1();
		System.out.println("This is m1 method in hem class");
		
	}
}

public class SuperKeyword {

	
	public static void main(String[] args)
	{
		hem h=new hem();
		h.m1();
		System.out.println(h.a);
	}
}
