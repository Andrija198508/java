package zadatak62_91;

import java.util.Scanner;

public class RazgranataStruktura7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double x, y;
		
		Scanner ulaz = new Scanner(System.in);
		
		System.out.println("Unesite vrednost za x:");
		x = ulaz.nextDouble();
		
		if(x < 0) {
			y = -1;
		}
		else if(x == 0) {
			y = 0;
		}
		else {
			y = 1;
		}
		System.out.println("Vrednost funkcije y je: " + y);
		ulaz.close();
	}

}
