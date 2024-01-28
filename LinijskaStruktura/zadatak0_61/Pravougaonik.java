package zadatak0_61;

import java.util.Scanner;

public class Pravougaonik {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite vrednost stranice pravougaonika a: ");
		double a = ulaz.nextDouble();
		System.out.println("Unesite vrednost stranice pravougaonika b: ");
		double b = ulaz.nextDouble();
		System.out.println("Dijagonala pravougaonika je: " + Math.sqrt(a * a + b * b));
		ulaz.close();
	}

}
