package zadatak92_99;

import java.util.Scanner;

public class SwitchCase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ulaz = new Scanner(System.in);
		
		System.out.println("Unesite redni broj dana:");
		int redniBrojDana = ulaz.nextInt();
		
		switch(redniBrojDana) {
		case 1:
			System.out.println("Ponedeljak");
			break;
		case 2:
			System.out.println("Utorak");
			break;
		case 3:
			System.out.println("Sreda");
			break;
		case 4:
			System.out.println("Četvrtak");
			break;
		case 5:
			System.out.println("Petak");
			break;
		case 6:
			System.out.println("Subota");
			break;
		case 7:
			System.out.println("Nedelja");
			break;
		default:
			System.out.println("Pogršan unos");
		}
		ulaz.close();
	}

}
