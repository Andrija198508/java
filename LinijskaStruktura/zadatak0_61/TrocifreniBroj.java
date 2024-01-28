package zadatak0_61;

import java.util.Scanner;

public class TrocifreniBroj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ulaz = new Scanner(System.in);
		System.out.println("Trocifreni broj: ");
		int broj = ulaz.nextInt();
		int s, d, j;
		s = broj / 100;
		d = (broj / 10) % 10;
		j = broj % 10;
		System.out.println("Broj = " + broj + ", cifra stotina = " + s + ", cifra desetica = " + d + ", cifra jedinica = " + j);
		ulaz.close();
	}

}
