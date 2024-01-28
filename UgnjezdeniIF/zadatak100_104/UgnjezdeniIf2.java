package zadatak100_104;

import java.util.Scanner;

public class UgnjezdeniIf2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char n;
		
		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite kategoriju:");
		n = ulaz.nextLine().charAt(0);
		ulaz.close();
		
		if(n == 'A' || n == 'a') {
			System.out.println("Možete voziti Motor.");
		}else if(n == 'B' || n == 'B') {
			System.out.println("Možete voziti Automobil.");
		}else if(n == 'C' || n == 'c') {
			System.out.println("Možete voziti Auto i Kamion");
		}else if(n == 'D' || n == 'd') {
			System.out.println("Možete voziti Autobus, Kamion i Auto");
		}else if(n == 'E' || n == 'e'){
			System.out.println("Možete voziti Kamion sa prikolicom, Autobus i Auto");
		}else {
			System.out.println("Pogrešan unos");
		}
	}

}
