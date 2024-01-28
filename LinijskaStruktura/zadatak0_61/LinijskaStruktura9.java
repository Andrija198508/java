package zadatak0_61;

import java.util.Scanner;

public class LinijskaStruktura9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite x:");
		double x = ulaz.nextDouble();
		double y = Math.sqrt((Math.exp(x / 2) + 1.2 * Math.sin(2 * x)) / (3.3 * Math.cos(x) + 7.1 * Math.exp(x)));
		
		System.out.println("y je: " + y);
		ulaz.close();
		}

}
