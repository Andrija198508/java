package zadatak0_61;

import java.util.Scanner;

public class Bajt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ulaz = new Scanner(System.in);
		System.out.println("Pretvaranje veličine memorije iz kilobajta u bajte");
		System.out.println("Veličina datoteke u kilobajtima: ");
		int kb = ulaz.nextInt();
		System.out.println("Veličina datoteke u bajtima: " + kb * 1024);
		ulaz.close();
	}

}
