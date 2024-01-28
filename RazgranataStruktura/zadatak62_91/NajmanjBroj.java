package zadatak62_91;

import java.util.Scanner;

public class NajmanjBroj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double a, b, c, min;
		
		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesi vrednost a:");
		a = ulaz.nextDouble();
		System.out.println("Unesi vrednost b:");
		b = ulaz.nextDouble();
		System.out.println("Unesi vrednost c:");
		c = ulaz.nextDouble();
		
		min = a;
		
		if(min == b && min == c)
			System.out.println("Nema najmanjeg broja jer su svi uneti isti");
		else {
			if(min > b)
				min = b;
			if(min > c)
				min = c;
			System.out.println("Najmanji broj je " + min);
		}
		ulaz.close();
	}

}
