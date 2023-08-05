package lambda_Expression;


interface Cab
{
	public void bookcab();
	default void waiting()
	{
		System.out.println("Waiting for Cab");
	}
	
	static void cancel()
	{
		System.out.println("Cancelling Cab");
	}
}

interface Lorry
{
	public String bookLorry(String source, String dest);
}

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cab cab=()->System.out.println("Cab is booked");
		cab.bookcab();
		Lorry lorry=(source,dest)->{System.out.println("Lorry is booked from "+source+" to "+dest);
		return ("Price is 1000 rupees");};
		lorry.bookLorry("Pondy","Mahe");
		cab.waiting();
		Cab.cancel();
		}
		
	}


