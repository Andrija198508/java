package zadatak0_61;

import java.util.Scanner;

public class Rastojanje {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite koordinate prve tačke: ");
		double x1 = ulaz.nextDouble();
		double y1 = ulaz.nextDouble();
		double a1 = Math.sqrt(x1 * x1 + y1 * y1);
		System.out.println("Unesite koordinate druge tačke: ");
		double x2 = ulaz.nextDouble();
		double y2 = ulaz.nextDouble();
		double a2 = Math.sqrt(x2 * x2 + y2 *y2);
		System.out.println("Rastojanje prve tačke (" + x1 + ", " + y1 + ") od koordinatnog početka je: " + a1);
		System.out.println("Rastojanje druge tačke (" + x2 + ", " + y2 + ") od koordinatnog početka je: " + a2);
		ulaz.close();
	}

}
