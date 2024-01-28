package zadatak0_61;

import java.util.Scanner;

public class RazlikaCifara {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite dvocifreni broj: ");
		int a = ulaz.nextInt();
		System.out.println("Dvocifreni broj: " + a);
		int d, j, r;
		d = a / 10;
		j = a % 10;
		r = d - j;
		System.out.println("Razlika cifara je: " + r);
		ulaz.close();
	}

}
