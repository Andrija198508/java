package zadatak0_61;

import java.util.Scanner;

public class Max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ulaz = new Scanner(System.in);
		
		System.out.println("Unesite vrednost za a: ");
		double a = ulaz.nextDouble();
		System.out.println("Unesite vrednost za b: ");
		double b = ulaz.nextDouble();
		
		System.out.println("y = " + (5 + Math.max(a * a, b * b)));
		ulaz.close();
	}

}
