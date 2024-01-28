package zadatak105_139;

import java.text.DecimalFormat;

public class ForPetlja33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a, b;
        DecimalFormat df = new DecimalFormat("###,###0.000");
        
        System.out.println("\ta\tb\tcos(a)\tcos(b)");
        for (a = 0.1; a <= 0.5; a += 0.1)
            for (b = 0.1; b <= 0.2; b += 0.1) {
            
            double p = Math.cos(a) - Math.cos(b);
            double q = -2 * Math.sin((a + b) / 2) * Math.sin((a - b) / 2);
            
            System.out
                .println("\t" + df.format(a) + "\t" + df.format(b) + "\t" + df.format(p) + "\t" + df.format(q));
            }
	}

}
