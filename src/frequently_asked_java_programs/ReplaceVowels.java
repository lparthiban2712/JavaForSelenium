package frequently_asked_java_programs;

public class ReplaceVowels {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="Aarthiban";
		
		String replace="";
		
		char[]c=name.toCharArray();
		String temp;
		String s;
		
		for(char e:c)
		{
			temp=String.valueOf(e);
			
			s=temp.toLowerCase();
			
			if(s.equals("a")|| s.equals("e") || s.equals("i") || s.equals("o") || s.equals("u"))
			{
				replace=replace+"*";
			}
			else
			{
				replace=replace+e;
			}
			
		}
		System.out.println(replace);

	}

}
