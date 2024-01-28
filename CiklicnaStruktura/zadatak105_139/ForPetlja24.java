package zadatak105_139;

import java.util.Scanner;

public class ForPetlja24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ulaz = new Scanner(System.in);
		double a, b, y;
		System.out.println("Unesite vrednost za n:");
		int n = ulaz.nextInt();
		for(int i = 1; i <= n; i++) {
			System.out.println("Unesite vrednost broja a:");
			a = ulaz.nextDouble();
			System.out.println("Unesite vrednost broja b:");
			b = ulaz.nextDouble();
			if(a >= 0)
				y = (1 - Math.min(a, b)) / (1 + Math.max(a, b));
			else
				y = Math.min(a, b) / (Math.min(a * a, b * b) + 3);
			System.out.println("Za unete vrednosti a = " + a + " i b = " + b+ " dobija se y = " + y);
		}
		ulaz.close();
	}

}
