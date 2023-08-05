package lamdaExpression;


interface Queen2
{
	int king2(int a, int b);
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

public class Demo2 {

	public static void main(String[] args) {
		//Soldier sl=new Soldier();
		Queen2 q2=(a,b)->{System.out.println("Addition of 2 numbers"); return a+b;};
		
		int sum=q2.king2(5,6);
		System.out.println(sum);

	}

}
