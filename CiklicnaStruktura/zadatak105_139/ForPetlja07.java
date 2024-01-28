package zadatak105_139;

import java.util.Scanner;

public class ForPetlja07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n, m, s = 1;
		
		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite vrednost za n:");
		n = ulaz.nextInt();
		System.out.println("Unesite vrednost za m:");
		m = ulaz.nextInt();
		ulaz.close();
		
		for(int i = 1; i <= m; i++) {
			s *= n + i * m;
		}
		System.out.println("Vrednost za S je: " + (n * s));
	}

}
