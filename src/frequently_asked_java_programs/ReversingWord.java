package frequently_asked_java_programs;

public class ReversingWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="I am Parthiban";
		String r="";
		
		String[]arr=s.split(" ");
		
		for(int i=arr.length-1;i>=0;i--)
		{
			r=r+arr[i]+"";
		}
		System.out.println(r);
	}

}
