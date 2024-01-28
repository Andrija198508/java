package zadatak62_91;

import java.util.Scanner;

public class VelikoMaloSlovo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ulaz = new Scanner(System.in);
		
		char x;
		
		System.out.println("Unesite x:");
		x = ulaz.next().charAt(0);
		
		if(x >= 'a' && x <= 'z') {
			System.out.println("Uneti karakter je malo slovo.");
		}
		else if(x >= 'A' && x <= 'Z') {
			System.out.println("Uneti karakter je veliko slovo.");
		}
		else if(x >= '0' && x <= '9') {
			System.out.println("Uneti karakter je broj.");
		}
		else
			System.out.println("Uneti karakter je specijalni znak.");
		ulaz.close();
	}

}
