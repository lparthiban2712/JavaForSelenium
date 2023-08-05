package java_programs;

public class SingleDimensionArray {

	public static void main(String[] args)
	{
		int a[]= {5,10,15,20,25};
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		for(int b:a)
		{
			System.out.println(b);
		}
	}
}
