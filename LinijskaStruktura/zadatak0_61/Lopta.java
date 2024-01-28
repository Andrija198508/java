package zadatak0_61;

import java.util.Scanner;

public class Lopta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite vrednost poluprečnika: " );
		double r = ulaz.nextDouble();
		double povrsina = Math.pow(r, 2) * Math.PI * 4;
		double zapremina = Math.pow(r, 3) * Math.PI * 4.0 / 3;
		System.out.println("Površina lopte je: " + povrsina);
		System.out.println("Zapremina lopte je: " + zapremina);
		ulaz.close();
	}

}
