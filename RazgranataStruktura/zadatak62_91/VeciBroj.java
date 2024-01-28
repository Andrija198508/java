package zadatak62_91;

import java.util.Scanner;

public class VeciBroj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x, y;
		
		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite vrednost za x:");
		x = ulaz.nextInt();
		System.out.println("Unesite vrednost za y:");
		y = ulaz.nextInt();
		
		if(x > y) {
			System.out.println("X je veće od Y");
	}else{
		System.out.println("X je manje od Y");
	}

	ulaz.close();
}
}
