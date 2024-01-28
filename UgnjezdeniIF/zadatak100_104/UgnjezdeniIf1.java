package zadatak100_104;

import java.util.Scanner;

public class UgnjezdeniIf1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int najveciBroj;
		Scanner ulaz = new Scanner(System.in);
		
		System.out.println("Unesite prvi broj:");
		int br1 = ulaz.nextInt();
		System.out.println("Unesite drugi broj:");
		int br2 = ulaz.nextInt();
		System.out.println("Unesite treći broj:");
		int br3 = ulaz.nextInt();
		ulaz.close();
		
		if(br1 > br2) {
			if(br1 > br3) {
				najveciBroj = br1;
			}else {
				najveciBroj = br3;
			}
		}else {
			if(br2 > br3) {
				najveciBroj = br2;
			}else {
				najveciBroj = br3;
			}
		}
		
		System.out.println("Najveći od unetih brojeva je: " + najveciBroj);
	}

}
