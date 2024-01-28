package zadatak62_91;

import java.util.Scanner;

public class Nula {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite vrednost za a:");
		int a = ulaz.nextInt();
		System.out.println("Unesite bvrednost za b:");
		int b = ulaz.nextInt();
		
		if(b != 0)
			System.out.println(a/b);
		else
			System.out.println("Deljenje nulom nije dozvoljeno");
		ulaz.close();
	}

}
