package zadatak0_61;

import java.util.Scanner;

public class LogickiIzraz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite vrednost x: ");
		boolean x = ulaz.nextBoolean();
		System.out.println("Unesite vrednost y: ");
		boolean y = ulaz.nextBoolean();
		
		boolean z = (!(x && y) || x && y);
		
		System.out.println("z = " + z);
		ulaz.close();
	}

}
