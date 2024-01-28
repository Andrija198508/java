package zadatak62_91;

import java.util.Scanner;

public class Oblast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ulaz = new Scanner(System.in);
		
		System.out.println("Unesite koordinatu x tačke:");
		double x = ulaz.nextDouble();
		System.out.println("Unesite koordinatu y tačke:");
		double y = ulaz.nextDouble();
		
		System.out.println("Unesite koordinatu x1 pravougaonika:");
		double x1 = ulaz.nextDouble();
		System.out.println("Unesite koordinatu x2 pravougaonika:");
		double x2 = ulaz.nextDouble();
		System.out.println("Unesite koordinatu y1 pravougaonika:");
		double y1 = ulaz.nextDouble();
		System.out.println("Unesite koordinatu y2 pravougaonika:");
		double y2 = ulaz.nextDouble();
		
		if((x > x1) && (x < x2) && (y > y1) && (y < y2))
			System.out.println("Tačka je unutar pravougaonika");
		else
			System.out.println("Tačka nije unutar pravougaonika");
		ulaz.close();
	}

}
