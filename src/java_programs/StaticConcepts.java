package java_programs;

public class StaticConcepts {

	static int a=10;
	int b=20;
	
	public static void fun()
	{
		System.out.println("static fun method");
	}
	
	public  void fun(int a)
	{
		System.out.println("non-static fun method");
	}
	
	public void demo()
	{
		System.out.println("non static fun method");
		System.out.println(a);
		System.out.println(b);
		StaticConcepts.fun();
		StaticConcepts ob2=new StaticConcepts();
		ob2.fun(5);
	}
	
	public static void main(String[] args)
	{
		System.out.println(a);
		StaticConcepts ob=new StaticConcepts();
		
		System.out.println(ob.b);
		StaticConcepts.fun();
		ob.demo();
		
	}
}
