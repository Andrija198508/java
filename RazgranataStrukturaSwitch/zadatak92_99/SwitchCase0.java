package zadatak92_99;

import java.util.Scanner;

public class SwitchCase0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ulaz = new Scanner(System.in);
		
		System.out.println("Unesite ocenu:");
		int ocena = ulaz.nextInt();
		ulaz.close();
		
		switch(ocena) {
		case 5:
			System.out.println("Odličan");
			break;
		case 4:
			System.out.println("Vrlo dobar");
			break;
		case 3:
			System.out.println("Dobar");
			break;
		case 2:
			System.out.println("Dovoljan");
			break;
		case 1:
			System.out.println("Nedovoljan");
			break;
		default:
			System.out.println("Pogrešan unos");
		}
	}

}
