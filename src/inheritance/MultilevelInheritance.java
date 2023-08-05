package inheritance;

class C
{
	int x=10;
	public void cfunction()
	{
		System.out.println("C-function");
	}
	
	
}

class D extends C
{
	int y=20;
	public void dfunction()
	{
		System.out.println("D-function");
	}
	
	
}

class E extends D
{
	int z=30;
	public void efunction()
	{
		System.out.println("E-function");
	}
	
	
}

public class MultilevelInheritance {
	
	public static void main(String[] args)
	{
	
	E e=new E();
	System.out.println(e.x);
	System.out.println(e.y);
	System.out.println(e.z);
	e.cfunction();
	e.dfunction();
	e.efunction();
	}

}
