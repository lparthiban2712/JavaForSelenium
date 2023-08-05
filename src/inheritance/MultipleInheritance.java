package inheritance;


interface AX
{
	void mc();
}

interface BX
{
	void md();
}
public class MultipleInheritance implements AX, BX {

	@Override
	public void md() {
		System.out.println("md method");
		
	}

	@Override
	public void mc() {
		System.out.println("mc method");
		
	}

}
