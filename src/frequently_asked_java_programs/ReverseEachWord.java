package frequently_asked_java_programs;

public class ReverseEachWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="My name is parthiban";
		String words[]=name.split(" ");
		String reverse="";
		
		for(String word:words)
		{
			StringBuilder sb=new StringBuilder(word);
			reverse=reverse+sb.reverse().toString()+" ";
		}
System.out.println(reverse);
	}

}
