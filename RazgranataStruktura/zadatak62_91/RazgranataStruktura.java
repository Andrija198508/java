package zadatak62_91;

import java.util.Scanner;

public class RazgranataStruktura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ulaz = new Scanner(System.in);
		int a;
		double y;
		System.out.println("Unesite vrednost broja a:");
		a = ulaz.nextInt();
		if(a % 2 != 0)
			y = (double) 1 / a;
		else
			y = (a - 1) * (a - 1);
		System.out.println("y je: " + y);
		ulaz.close();
	}

}
