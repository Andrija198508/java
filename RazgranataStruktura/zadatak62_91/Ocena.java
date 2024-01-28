package zadatak62_91;

import java.util.Scanner;

public class Ocena {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int bodovi;
		Scanner ulaz = new Scanner(System.in);
		
		System.out.println("Unesite bodove:");
		bodovi = ulaz.nextInt();
		
		if(bodovi < 0) {
			System.out.println("Nepravilan unos.");
		}
		else if(bodovi >= 0 && bodovi < 50) {
			System.out.println("Ocena je 1");
		}
		else if(bodovi >= 50 && bodovi < 60) {
			System.out.println("Ocena je 2");
		}
		else if(bodovi >= 61 && bodovi < 70) {
			System.out.println("Ocena je 3");
		}
		else if(bodovi >= 71 && bodovi < 80) {
			System.out.println("Ocena je 4");
		}
		else if(bodovi >= 81 && bodovi <= 100) {
			System.out.println("Ocena je 5");
		}
		else {
			System.out.println("Ne možete osvojiti preko 100 bodova");
		}
		ulaz.close();
	}

}
