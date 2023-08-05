package lamdaExpression;

@FunctionalInterface
interface Queen
{
	void king();
}

/*
 * class Soldier implements Queen {
 * 
 * @Override public void king() {
 * System.out.println("King method is implemented");
 * 
 * }
 * 
 * }
 */

public class Demo1 {

	public static void main(String[] args) {
		//Soldier sl=new Soldier();
		Queen sl=()->System.out.println("King method is implemented");
		
		sl.king();

	}

}
