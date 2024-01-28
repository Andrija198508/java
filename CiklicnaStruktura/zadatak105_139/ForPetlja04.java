package zadatak105_139;

import java.util.Scanner;

public class ForPetlja04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double a, b, zbir = 0d;
		Scanner ulaz = new Scanner(System.in);
		
		System.out.println("Unesite prvi broj:");
		a = ulaz.nextDouble();
		System.out.println("Unesite poslednji broj:");
		b = ulaz.nextDouble();
		
		for (double i = a; i <= b; i++) {
			System.out.println("Unesite " + i + ". broj: ");
			double j = ulaz.nextDouble();
			zbir += j;
		}
		
		System.out.println("Zbir ovih brojeva je " + zbir);
		ulaz.close();
	}

}
