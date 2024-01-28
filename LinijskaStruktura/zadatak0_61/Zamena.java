package zadatak0_61;

import java.util.Scanner;

public class Zamena {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x, y;
		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite vrednost x:");
		x = ulaz.nextInt();
		System.out.println("Unesite vrednosty:");
		y = ulaz.nextInt();
		
		System.out.println("Pre zamene\nx = " + x + "\ny = " + y);
		
		int temp = x;
		x = y;
		y = temp;
		
		System.out.println("Posle zamene\nx = " + x + "\ny = " + y);
		ulaz.close();
	}

}
