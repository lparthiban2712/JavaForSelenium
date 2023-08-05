package inheritance;

final class Modi {
	final int z = 12;

	public final void animal() {
		System.out.println(" this is animal method");
	}
}

/*
 * class Raghul extends Modi { final int z=12;
 * 
 * public void animal() { System.out.println(" this is animal method"); }
 * 
 * }
 */

public class FinalKeyword {

	public static void main(String[] args) {
		Modi mo = new Modi();
		System.out.println(mo.z);
		// mo.z=13;

	}

}
