package zadatak92_99;

import java.util.Scanner;

public class SwitchCase3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int ugao;
		
		Scanner ulaz = new Scanner(System.in);
		
		System.out.println("Unesite ugao:");
		ugao = ulaz.nextInt();
		
		if (ugao > 0 && ugao < 90) {
			System.out.println("Prvi kvadrant");
		}else if(ugao > 90 && ugao < 180) {
			System.out.println("Drugi kvadrant");
		}else if(ugao > 180 && ugao < 270) {
			System.out.println("Treći kvadrant");
		}else if(ugao > 270 && ugao < 360) {
			System.out.println("Četvrti kvadrant");
		}else {
			System.out.println("Uneti ugao se nalazi na x ili y osi");
		}
		ulaz.close();
	}

}
