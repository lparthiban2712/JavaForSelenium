package java_programs;

public class TwoDimensionalArray {
	
	
	
	public static void main(String[] args)
	{
		int a[][]=new int[3][2];
		
		a[0][0]=10;
		a[0][1]=20;
		a[1][0]=30;
		a[1][1]=40;
		a[2][0]=50;
		a[2][1]=60;
		
		for (int i=0;i<a.length;i++)
		{
			for (int j=0;j<a[i].length;j++)
			{
				System.out.println(a[i][j]);
			}
		}
		
		for (int r[]:a)
		{
			for(int b:r)
			{
				System.out.println(b);
			}
		}
		
	}

}
