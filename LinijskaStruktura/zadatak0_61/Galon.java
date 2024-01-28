package zadatak0_61;

import java.util.Scanner;

public class Galon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unestie zapreminu u galonima: ");
		double g = ulaz.nextDouble();
		System.out.println("Zapremina u litrima je: " + g * 4.54);
		ulaz.close();
	}

}
