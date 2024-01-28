package zadatak105_139;

import java.text.DecimalFormat;

public class ForPetlja16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DecimalFormat df = new DecimalFormat("#.###");
		
		double s = 0;
		
		for (int n = 1; n <= 50; n++)
            s += (n + 2.5) / (n * n + 1.2);
		
		System.out.println("Dobijena vrednost sume je " + df.format(s));
	}

}
