package zadatak62_91;

import java.util.Scanner;

public class IfElseStruktura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double x, y;
		
		Scanner ulaz = new Scanner(System.in);
		
		System.out.println("Unesite x:");
		x = ulaz.nextDouble();
		
		if(x >= 0) 
			y = x;
		else
			y = -x;
		
		System.out.println("Za uneto x = " + x + " dobija se y = " + y);
		ulaz.close();
	}

}
