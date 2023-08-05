package inheritance;

class A
{
	int x;
	public void parentfunction()
	{
		System.out.println("parentfunction");
	}
	
	
}

class B extends A
{
	int y;
	public void childfunction()
	{
		System.out.println("parentfunction");
	}
	
	
}

public class SingleInheritance {
	
	public static void main(String[] args)
	{
	
	A a=new A();
	System.out.println(a.x);
	a.parentfunction();
	B b=new B();
	System.out.println(b.x);
	System.out.println(b.y);
	b.parentfunction();
	b.childfunction();
	}

}
