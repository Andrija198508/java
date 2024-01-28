package zadatak62_91;

import java.util.Scanner;

public class KorenKvadrata {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite vrednost za a:");
		double a = ulaz.nextDouble();
		double y;
		if(a > 0)
			y = Math.sqrt(a);
		else
			y = a * a;
		System.out.println("y je: " + y);
		ulaz.close();
	}

}
