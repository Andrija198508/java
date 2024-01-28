package zadatak62_91;

import java.util.Scanner;

public class MinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ulaz = new Scanner(System.in);
		double a, b, y;
		System.out.println("Unesite vrednost broja a:");
		a = ulaz.nextDouble();
		System.out.println("Unesite vrednost broja b:");
		b = ulaz.nextDouble();
		
		if(a >= 0)
			y = (1 - Math.min(a, b)) / (1 + Math.max(a, b));
		else
			y = Math.min(a, b) / (Math.min(a * a, b * b) + 3);
		System.out.println("y je: " + y);
		ulaz.close();
	}

}
