package inheritance;

class AA
{
	public void eee()
	{
		System.out.println("eee mthod");
	}
}

interface AB
{
	void ABmethod();
}

interface CD
{
	void CDmethod();
}
public class HybridInheritance extends AA implements AB,CD{

	public static void main(String[] args) {
		HybridInheritance hi=new HybridInheritance();
		hi.CDmethod();
		hi.ABmethod();
		

	}

	@Override
	public void CDmethod() {
		System.out.println("CD method");
		
	}

	@Override
	public void ABmethod() {
		// TODO Auto-generated method stub
		System.out.println("AB method");
		
	}

}
