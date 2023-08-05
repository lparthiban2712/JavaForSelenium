package frequently_asked_java_programs;

public class ExtractNumbersFromStringandAdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name="Parthi27ban142";
		int total=0;
		
		char[]c=name.toCharArray();
		
		for(char e:c)
		{
			if(Character.isDigit(e))
			{
				total=total+Character.getNumericValue(e);
			}
		}
		System.out.println(total);

	}

}
