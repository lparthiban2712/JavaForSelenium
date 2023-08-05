package frequently_asked_java_programs;

import java.util.Scanner;

public class PrintTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int r=s.nextInt();
		for(int i=1;i<=r;i++)
		{
			for (int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		

	}

}
