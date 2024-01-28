package zadatak0_61;

import java.util.Scanner;

public class MinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite vrednost za a: ");
		double a = ulaz.nextDouble();
		System.out.println("Unesite vrednost za b: ");
		double b = ulaz.nextDouble();
		System.out.println("y = " + (1 - Math.min(a, b)) / (1 + Math.max(a, b)));
		ulaz.close();
		}
}
