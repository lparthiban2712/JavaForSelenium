package frequently_asked_java_programs;

public class CharacterOccurrences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name="IamParthiban";
		char[]c=name.toCharArray();
		int count=0;
		
		for(char e:c)
		{
			if(e=='t')
			{
				count++;
			}
		}
		System.out.println(count);

	}

}
