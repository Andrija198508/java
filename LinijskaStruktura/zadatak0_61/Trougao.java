package zadatak0_61;

import java.util.Scanner;

public class Trougao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite stranice trougla a, b, c");
		double a = ulaz.nextDouble();
		double b = ulaz.nextDouble();
		double c = ulaz.nextDouble();
		double obim = a + b +c;
		System.out.println("Obim trougla je: " + obim);
		double s = obim / 2;
		double povrsina = Math.sqrt(s * (s - a) * (s - b) * (s - c));
		System.out.println("Površina trougla je: " + povrsina);
		ulaz.close();
	}

}
