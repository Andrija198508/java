package zadatak62_91;

import java.util.Scanner;

public class RazgranataStruktura6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double x, y;
		
		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite vrednost za x:");
		x = ulaz.nextDouble();
		
		if(x < 0) {
			y = 5;
		}
		else if(x >= 0 && x <= 1) {
			y = x + 2;
		}
		else if(x >= 1 && x < 5) {
			y = 3 * x - 1;
		}
		else {
			y = 2 * x;
		}
		System.out.println("Vrednost funkcije y je: " + y);
		ulaz.close();
	}

}
