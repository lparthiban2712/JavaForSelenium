package java_programs;

public class BasicProgram {

	int x=10;
	String name="James";
	
	public void demo()
	{
		System.out.println("demo function");
	}
	
	public static void main(String[] args)
	{
		BasicProgram ob=new BasicProgram();
		ob.demo();
		System.out.println(ob.x);
	}
}
