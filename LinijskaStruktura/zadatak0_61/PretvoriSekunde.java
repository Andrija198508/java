package zadatak0_61;

import java.util.Scanner;

public class PretvoriSekunde {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite sate:");
		int s = ulaz.nextInt();
		System.out.println("Unesite minute:");
		int m = ulaz.nextInt();
		System.out.println("Unesite sekunde:");
		int sek = ulaz.nextInt();
		
		System.out.println("Vreme izraženo u sekundama je: " + (s *3600 + m * 60 + sek));
		ulaz.close();
	}

}
