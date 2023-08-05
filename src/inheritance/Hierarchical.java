package inheritance;

class F
{
	int x=10;
	public void ffunction()
	{
		System.out.println("F-function");
	}
	
	
}

class G extends F
{
	int y=20;
	public void gfunction()
	{
		System.out.println("G-function");
	}
	
	
}

class H extends F
{
	int z=30;
	public void hfunction()
	{
		System.out.println("H-function");
	}
	
	
}

public class Hierarchical {
	
	public static void main(String[] args)
	{
	
	G g=new G();
	g.ffunction();
	g.ffunction();
	H h=new H();
	h.ffunction();
	h.hfunction();
	
	}

}
