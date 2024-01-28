package zadatak0_61;

import java.util.Scanner;

public class Farenhajt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite temperaturu u celzijusima: ");
		double tc = ulaz.nextDouble();
		System.out.println("Temperatura u farenhajtima je: " + (tc * 1.8 + 32));
		ulaz.close();
	}

}
