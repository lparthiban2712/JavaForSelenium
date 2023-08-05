package frequently_asked_java_programs;

public class StringReverse {

	public static void main(String[] args)
	{
		String s="parthi";
		StringBuilder sb=new StringBuilder();
		sb.append(s);
		System.out.println(sb.reverse());
		
		String p="parthi";
		String reverse="";
		char[]c=p.toCharArray();
		
		for(int i=c.length-1;i>=0;i--)
		{
			reverse=reverse+c[i];
		}
		
		System.out.println(reverse);
	}
}
