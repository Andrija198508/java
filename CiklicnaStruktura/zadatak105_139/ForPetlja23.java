package zadatak105_139;

import java.text.DecimalFormat;

public class ForPetlja23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DecimalFormat df = new DecimalFormat("###,##0.00");
		
		System.out.println("\tX\tF(X)");
		
		double f, x;
		for(x = 1.0; x <= 2.0; x += 0.2) {
			f = 41.926 * Math.sqrt(1 + Math.pow(x, 3)) + Math.pow(x, 1.0 / 3.0) * Math.exp(x);
			System.out.println("\t" + df.format(x) + "\t" + df.format(f));
		}
	}

}
