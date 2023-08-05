package java_programs;

public class StringsPractice {

	public static void main(String[] args)
	{
		String s="Welcome";
		String s1="to java";
		String s2=" welcome ";
		//to find length of a string
		System.out.println("Lenght of a string is "+s.length());
		
		//to concatenate two strings
		System.out.println(s.concat(s1));
		
		//to trim the space in a string
		System.out.println(s2.trim());
		
		//to compare two strings, case sensitive
		System.out.println(s.equals(s1));
		System.out.println(s.equals("Welcome"));
		
		//to compare two strings, case insensitive
				System.out.println(s.equalsIgnoreCase(s1));
				System.out.println(s.equals(" Welcome"));//space is considered, hence answer is false
				
		//character at string position
		System.out.println(s.charAt(3));
		
		//contains
		System.out.println(s.contains("W"));
		System.out.println(s.contains("Wel"));
		
		//replace
		System.out.println(s.replace('e', 'z'));
		System.out.println(s1.replace("java", "selenium"));
		
		//substring
		System.out.println(s.substring(1,3));
	}
}
