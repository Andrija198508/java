package zadatak350;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ALBrojevi {
	Scanner ulaz = new Scanner(System.in);
	
	List brojevi = new ArrayList();
	
	void unosBrojeva() {
		System.out.println("Za prekid unošenja, unesite -1: ");
		while(true) {
			System.out.println("Broj: ");
			int num = ulaz.nextInt();
			if(num == -1) {
				return;
			}
			this.brojevi.add(num);
		}
	}
	
	void ispisiBrojeve() {
		System.out.println(this.brojevi);
	}
}
