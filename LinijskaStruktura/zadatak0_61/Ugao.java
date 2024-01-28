package zadatak0_61;

import java.util.Scanner;

public class Ugao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite vrednost ugla u radijanima: ");
		double x = ulaz.nextDouble();
		System.out.println("Sinus zadatog ugla je: " + Math.sin(x));
		System.out.println("Kosinus zadatog ugla je: " + Math.cos(x));
		ulaz.close();
	}

}
