package zadatak0_61;

import java.util.Scanner;

public class BMI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite visinu osobe:");
		double visina = ulaz.nextDouble();
		System.out.println("Unesite masu osobe:");
		double masa = ulaz.nextDouble();
		
		System.out.println("Indeks telesne mase BMI = " + masa / Math.pow(visina, 2));
		ulaz.close();
	}

}
