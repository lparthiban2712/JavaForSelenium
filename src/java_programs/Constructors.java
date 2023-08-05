package java_programs;

public class Constructors {

	int x;
	int y;
	int sum;
	
	Constructors(int a, int b)
	{
		this.x=a;
		this.y=b;
	}
	
	public void sum() {
		this.sum=x+y;
		System.out.println(this.sum);
	}
	
	public static void main(String[] args)
	{
		Constructors ob=new Constructors(5,2);
		ob.sum();
		
	}
}
