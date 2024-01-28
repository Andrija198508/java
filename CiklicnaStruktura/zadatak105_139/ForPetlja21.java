package zadatak105_139;

import java.text.DecimalFormat;

public class ForPetlja21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DecimalFormat df = new DecimalFormat("#.###");
       
        double p = 1;
        
        for (int n = 1; n <= 5; n++)
                p *= (double) (n + 2.5) / (n * n + 1.2);
        
        System.out.println("Dobijena vrednost proizvoda je " + df.format(p));
	}

}
