package zadatak62_91;

import java.util.Scanner;

public class ParanBroj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int broj;
		Scanner ulaz = new Scanner(System.in);
		
		System.out.println("Unesite broj:");
		broj = ulaz.nextInt();
		
		if(broj == 0) {
			System.out.println("Uneli ste nulu.");
		}else if(broj % 2 == 0) {
			System.out.println("Uneli ste paran broj.");
		}else {
			System.out.println("Uneli ste neparan broj.");
		}
		ulaz.close();
	}

}
