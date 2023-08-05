package frequently_asked_java_programs;

public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="mommy";
		String r="";
		char[] c=s.toCharArray();
		for(int i=c.length-1;i>=0;i--)
		{
			r=r+c[i];
		}
		if(r.equals(s))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("not palindrome");
		}
		

	}

}
