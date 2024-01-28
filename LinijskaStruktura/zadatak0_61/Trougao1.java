package zadatak0_61;

import java.util.Scanner;

public class Trougao1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite stranicu trougla x: ");
		int x = ulaz.nextInt();
		System.out.println("Unesite stranicu trougla y: ");
		int y = ulaz.nextInt();
		System.out.println("Unesite stranicu trougla z: ");
		int z = ulaz.nextInt();
		
		boolean p = (x + y > z) && (x + z > y) && (y + z > x);
		System.out.println("p = " + p);
		ulaz.close();
		
	}

}
