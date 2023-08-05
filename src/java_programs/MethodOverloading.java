package java_programs;

public class MethodOverloading {
	
	public void main()
	{
		System.out.println("This is main method with no parameters");
	}
	
	public void main(int x)
	{
		System.out.println("This is main method with parameter x");
	}
	public static void main(int y, int z)
	{
		System.out.println("This is main method with parameter y and z");
		String[] a= {"Welcom", "to", "java"};
		
	}

	public static void main(String[] args)
			{
		MethodOverloading mo=new MethodOverloading();
		mo.main();
		mo.main(2);
		mo.main(2,3);
		
		//mo.main("Welcome","to java");
		
			}
}
