package zadatak92_99;

import java.util.Scanner;

public class SwitchCase2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char karakter;
		
		Scanner ulaz = new Scanner(System.in);
		
		System.out.println("Unesite slovo:");
		karakter = ulaz.next().charAt(0);
		
		if (karakter >= 'a' && karakter <= 'z' || karakter >= 'A' && karakter <= 'Z') {
			switch (karakter) {
			case 'a':
			case 'A':
				System.out.println("Samoglasnik");
				break;
			case 'e':
			case 'E':
				System.out.println("Samoglasnik");
				break;
			case 'i':
			case 'I':
				System.out.println("Samoglasnik");
				break;
			case 'o':
			case 'O':
				System.out.println("Samoglasnik");
				break;
			case 'u':
			case 'U':
				System.out.println("Samoglsnik");
				break;
			default:
				System.out.println("Suglasnik");
			}
			ulaz.close();
		}else {
			System.out.println("Pogrešan unos");
		}
	}

}
