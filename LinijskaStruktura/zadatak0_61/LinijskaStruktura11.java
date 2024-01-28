package zadatak0_61;

import java.util.Scanner;

public class LinijskaStruktura11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double a, b, c, p, v;
		
		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite vrednost stranice a:");
		a = ulaz.nextDouble();
		System.out.println("Unesite vrednost stranice b:");
		b = ulaz.nextDouble();
		System.out.println("Unesite vrednost stranice c:");
		c = ulaz.nextDouble();
		
		p = 2 * ((a * b) + (a * c) + (b * c));
		v = a * b * c;
		System.out.println("Površina kvadra je: " + p + "\nZapremina kvadra je: " + v);
		ulaz.close();
	}

}
