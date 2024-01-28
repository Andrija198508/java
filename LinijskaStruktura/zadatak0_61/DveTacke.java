package zadatak0_61;

import java.util.Scanner;

public class DveTacke {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite koordinate tačke M: ");
		double x1 = ulaz.nextDouble();
		double y1 = ulaz.nextDouble();
		System.out.println("Unesite koordinate tačke N: ");
		double x2 = ulaz.nextDouble();
		double y2 = ulaz.nextDouble();
		double d = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
		System.out.println("rastojanje između tačaka M(" + x1 + ", " + y1 + ") i N(" + x2 + ", " + y2 + ") je: " + d);
		ulaz.close();
	}

}
