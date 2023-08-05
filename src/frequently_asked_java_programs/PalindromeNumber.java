package frequently_asked_java_programs;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int given_num=16461;
		int temp=given_num;
		
		int rev=0;
		
		while(given_num!=0)
		{
			rev=rev*10;
			rev=rev+given_num%10;
			given_num=given_num/10;
		}
		
		System.out.println(rev);
		if(temp==rev)
		{
			System.out.println("Palindrome");
		}
		
		else
		{
			System.out.println("Not Palindrome");
		}
	}

}
