package zadatak62_91;

import java.util.Scanner;

public class Min {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ulaz = new Scanner(System.in);
		int a, b, y;
		System.out.println("Unesite vrednost broja a:");
		a = ulaz.nextInt();
		System.out.println("Unesite vrednost broja b:");
		b = ulaz.nextInt();
		
		if(a >= 0)
			y = Math.min(a, b);
		else
			y = 2 * Math.min(a, b);
		
		System.out.println("y je: " + y);
		ulaz.close();
	}

}
