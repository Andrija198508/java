package zadatak105_139;

import java.util.Scanner;

public class ForPetlja15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int negativni = 0, pozitivni = 0, nule = 0;
        
        Scanner ulaz = new Scanner(System.in);
        
        for (int i = 1; i <= 10; i++) {
            System.out.println("Unesite " + i + ". broj: ");
            double j = ulaz.nextDouble();
            if (j == 0) {
            nule++;
            } else if (j > 0) {
            pozitivni++;
            } else {
            negativni++;
            }
    
        }
        
        System.out.println("Pozitivni brojevi: " + pozitivni + "\nNegativni brojeva: " + negativni + "\nNule: " + nule);
        ulaz.close();
	}

}
