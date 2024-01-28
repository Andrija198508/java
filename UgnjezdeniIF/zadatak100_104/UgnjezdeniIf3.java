package zadatak100_104;

import java.util.Scanner;

public class UgnjezdeniIf3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
        System.out.println("Unesite kategoriju: ");
        char n = sc.nextLine().charAt(0);
        sc.close();
        
        switch (n) {
        case 'A':
        case 'a':
            System.out.println("Mozete voziti Motor.");
            break;
        case 'B':
        case 'b':
            System.out.println("Mozete voziti Automobil.");
            break;
        case 'C':
        case 'c':
            System.out.println("Mozete voziti Auto i Kamion");
            break;
        case 'D':
        case 'd':
            System.out.println("Mozete voziti Autobus, Kamion i Auto.");
            break;
        case 'E':
        case 'e':
            System.out.println("Mozete voziti Auto, Kamion i Autobus.");
            break;
        default:
            System.out.println("Neispravan unos!");
    
        }
	}

}
