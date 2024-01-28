package zadatak0_61;

import java.util.Scanner;

public class Sekunde {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ulaz = new Scanner(System.in);
		System.out.println("Proteklo sekundi: ");
		int n = ulaz.nextInt();
		int sat = n / 3600;
		int sek1 = n % 3600;
		int min = sek1 / 60;
		int sek = sek1 % 60;
		System.out.println("Proteklo sati: " + sat);
		System.out.println("Minuta: " + min);
		System.out.println("Sekundi: " + sek);
		ulaz.close();
	}

}
