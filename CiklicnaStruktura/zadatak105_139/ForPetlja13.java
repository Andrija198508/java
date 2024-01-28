package zadatak105_139;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ForPetlja13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double imenilac, brojilac = 0d;
		
		DecimalFormat df = new DecimalFormat("#.##");
		Scanner ulaz = new Scanner(System.in);
		
		System.out.println("Koliko cifara želite da unesete?");
		imenilac = ulaz.nextDouble();
		
		for(int i = 1; i <= imenilac; i++) {
			System.out.println("Unesite " + i + ". cifru: ");
			double j = ulaz.nextDouble();
			brojilac += j;
		}
		
		System.out.println("Aritmetička sredina je " + df.format((brojilac / imenilac)));
		ulaz.close();
	}

}
