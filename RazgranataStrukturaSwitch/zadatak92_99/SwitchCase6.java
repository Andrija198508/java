package zadatak92_99;

import java.util.Scanner;

public class SwitchCase6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int k1, k2, k3, boolToInt;
		boolean i;
		
		Scanner ulaz = new Scanner(System.in);
		
		System.out.println("Unesite vrednost za k1:");
		k1 = ulaz.nextInt();
		System.out.println("Unesite vrednost za k2:");
		k2 = ulaz.nextInt();
		System.out.println("Unesite vrednost za k3:");
		k3 = ulaz.nextInt();
		
		i = ((k2 - k1) % 7 == 0 && (k3 - k1) % 7 == 0);
		
		boolToInt = i ? 1 : 0;
		
		System.out.println("Rešenje sa Switch:");
		switch(boolToInt) {
		case 1:
			System.out.println("Isti dan u nedelji!");
			break;
		case 0:
			System.out.println("Nije isi dan u nedelji!");
			break;
		default:
			System.out.println("Pogrešan unos!");
		}
		
		//Sa IF/ELSE
		
		System.out.println("\nRešenje sa If/Else:");
		if((k2 - k1) % 7 == 0 && (k3 - k1) % 7 == 0) {
			System.out.println("Isti dan u nedelji!");
		}else {
			System.out.println("Nije isti dan u nedelji!");
		}
		ulaz.close();
	}

}
