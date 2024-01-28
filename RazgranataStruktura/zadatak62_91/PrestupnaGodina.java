package zadatak62_91;

import java.util.Scanner;

public class PrestupnaGodina {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int godina;
		Scanner ulaz = new Scanner(System.in);
		
		System.out.println("Unesite godinu:");
		godina = ulaz.nextInt();
		
		if(godina % 4 == 0 && !(godina % 100 == 0) || godina % 400 == 0) {
			System.out.println("Uneta godina je prestupna.");
		}
		else {
			System.out.println("Uneta godina nije prestupna.");
		}
		ulaz.close();
	}

}
