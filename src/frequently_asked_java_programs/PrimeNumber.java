package frequently_asked_java_programs;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=s.nextInt();
		boolean flag=false;
		
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				flag=true;
				break;
			}
		}
		
		if(flag==true)
		{
			System.out.println("It's not prime number");
		}
		else
		{
			System.out.println("prime number");
		}

	}

}
