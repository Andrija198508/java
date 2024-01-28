package zadatak0_61;

import java.util.Scanner;

public class Pravougaonik1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ulaz = new Scanner(System.in);
		System.out.print("Unesite stranicu prvog pravougaonika a: ");
		int a = ulaz.nextInt();
		System.out.print("Unesite stranicu prvog pravougaonika b: ");
		int b = ulaz.nextInt();
		System.out.print("Unesite stranicu drugog pravougaonika c: ");
		int c = ulaz.nextInt();
		System.out.print("Unesite stranicu drugog pravougaonika d: ");
		int d = ulaz.nextInt();
		boolean p = ((a < c) && (b < d)) || ((a < d) && (b < c));
		System.out.println("p = " + p);
		ulaz.close();
	}

}
