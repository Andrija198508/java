package zadatak105_139;

import java.util.Scanner;

public class ForPetlja06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n;
		int faktorijel = 1;
		
		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite broj za koji izračunavamo faktorijel: ");
		n = ulaz.nextInt();
		
		for(int i = 2; i <= n; i++) {
			faktorijel *= i;
		}
		
		System.out.println("Faktorijel prirodnog broja " + n + " je " + faktorijel);
		ulaz.close();
	}

}
