package zadatak92_99;

import java.util.Scanner;

public class SwitchCase7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int godina, boolToInt;
		boolean i;
		Scanner ulaz = new Scanner(System.in);
		
		System.out.println("Unesite godinu:");
		godina = ulaz.nextInt();
		
		i = (godina % 4 == 0 && !(godina % 100 == 0) || godina % 400 == 0);
		boolToInt = i ? 1 : 0;
		
		switch(boolToInt) {
		case 1:
			System.out.println("Februar: 29 dana");
			break;
		case 0:
			System.out.println("Februar: 28 dana");
			break;
		}
		
		if(godina % 4 == 0 && !(godina % 100 == 0) || godina % 400 == 0) {
			System.out.println("Februar: 29 dana");
		}else {
			System.out.println("Februar: 28 dana");
		}
		ulaz.close();
	}

}
