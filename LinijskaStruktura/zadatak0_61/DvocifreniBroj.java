package zadatak0_61;

import java.util.Scanner;

public class DvocifreniBroj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ulaz = new Scanner(System.in);
		System.out.println("Cifre dvocifrenog broja ");
		System.out.println("Dvocifreni broj ");
		int a = ulaz.nextInt();
		int d, j;
		d = a / 10;
		j = a % 10;
		System.out.println("broj = " + a + " cifra jedinica = " + j + " " + "cifra desetica = " + d);
		ulaz.close();
	}

}
