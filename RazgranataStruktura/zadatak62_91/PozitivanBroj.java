package zadatak62_91;

import java.util.Scanner;

public class PozitivanBroj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite broj:");
		int broj = ulaz.nextInt();
		
		if(broj == 0)
			System.out.println("Broj je nula");
		else if (broj > 0)
			System.out.println("Broj je pozitivan");
		else
			System.out.println("Broj je negativan");
		ulaz.close();
	}

}
