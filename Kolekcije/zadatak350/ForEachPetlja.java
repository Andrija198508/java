package zadatak350;

import java.util.Scanner;

public class ForEachPetlja {

	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);
		
		int[] brojevi = new int[5];
		
		int niz[] = {2, 2, 2, 2, 2};
		
		for(int i = 0; i < brojevi.length; i++) {
			System.out.print("brojevi[" + i + "] = ");
			brojevi[i] = ulaz.nextInt();
			
			if((i + 1) == brojevi.length) {
				System.out.println("Niz je napunjen!");
			}
		}
		
		System.out.println("\nIzgled niza 'brojevi':");
		for(int i : brojevi) {
			System.out.print(i + ", ");
		}
		
		System.out.println("\nIzgled niza 'niz':");
		for(int j : niz) {
			System.out.print(j + ", ");
		}
		ulaz.close();
	}

}
