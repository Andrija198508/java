package zadatak105_139;

import java.util.Scanner;

public class ForPetlja10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a, b;
		
		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite prvi broj opsega intervala: ");
		a = ulaz.nextInt();
		System.out.println("Unesite poslednji broj opsega intervala: ");
		b = ulaz.nextInt();
		ulaz.close();
		
		for(int i = a; i <= b; i++) {
			if(i % 3 == 0) {
				System.out.println(i + " ");
			}
		}
	}

}
