package zadatak62_91;

import java.util.Scanner;

public class AritmetickiIzraz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite vrednost za a:");
		double a = ulaz.nextDouble();
		System.out.println("Unesite vrednost za b:");
		double b = ulaz.nextDouble();
		double z;
		
		if(a > b)
			z = 2 * a + b;
		else
			z = a - 2 * b;
		System.out.println("z je: " + z);
		ulaz.close();
	}

}
