package zadatak62_91;

import java.util.Scanner;

public class ReciprocnaVrednost {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite vrednost za a:");
		int a = ulaz.nextInt();
		System.out.println("Unesite vrednost za b:");
		int b = ulaz.nextInt();
		System.out.println("Unesite vrednost za c:");
		int c = ulaz.nextInt();
		
		double r = 0;
		double min = a;
		
		if(b < min)
			min = b;
		if(c < min)
			min = c;
		System.out.println("Najmanji broj je " + min);
		if(min == 0)
			r = 3;
		else
			r = 1 / min;
		System.out.println("r = " + r);
		ulaz.close();
	}

}
