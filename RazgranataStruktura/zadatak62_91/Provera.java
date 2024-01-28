package zadatak62_91;

import java.util.Scanner;

public class Provera {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite vrednost za a:");
		int a = ulaz.nextInt();
		System.out.println("Unesite vrednost za b:");
		int b = ulaz.nextInt();
		int z;
		
		if((a % 2 != 0) && (b % 2 == 0))
			z = a + b;
		else
			z = a - b;
		System.out.println("z = " + z);
		ulaz.close();
	}

}
