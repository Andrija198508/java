package zadatak62_91;

import java.util.Scanner;

public class RazgranataStruktura8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double x, y;
		
		Scanner ulaz = new Scanner(System.in);
		
		System.out.println("Unesite vrednost za x:");
		x = ulaz.nextDouble();
		
		if(x > -2 && x <= 2) {
			y = 2 * x;
		}
		else if(x >= 5 && x <= 7) {
			y = 3 * -1;
		}
		else {
			y = 1 / x;
		}
		System.out.println("Vrednost y je:" + y);
		ulaz.close();
	}

}
