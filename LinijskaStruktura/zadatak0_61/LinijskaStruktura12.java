package zadatak0_61;

import java.text.DecimalFormat;
import java.util.Scanner;

public class LinijskaStruktura12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double a, b, c, la, ma;
		DecimalFormat df = new DecimalFormat("#.##");
		
		Scanner ulaz = new Scanner(System.in);
		
		System.out.println("Unesite vrednost tranice a:");
		a = ulaz.nextDouble();
		System.out.println("Unesite vrednost tranice b:");
		b = ulaz.nextDouble();
		System.out.println("Unesite vrednost tranice c:");
		c = ulaz.nextDouble();
		
		la = 1 / (b + c) * Math.sqrt(b * c * Math.pow(b + c, 2) - Math.pow(a, 2));
		ma = 0.5 * Math.sqrt(2 * (Math.pow(b, 2) + Math.pow(c, 2)) - a * a);
		
		System.out.println("La = " + df.format(la) + "\nma = " + df.format(ma));
		ulaz.close();
	}

}
