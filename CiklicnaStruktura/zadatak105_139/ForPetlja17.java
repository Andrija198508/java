package zadatak105_139;

import java.io.*;
import java.text.DecimalFormat;

public class ForPetlja17 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		DecimalFormat df = new DecimalFormat("#.###");
        BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
        
        double s = 0;
        
        System.out.print("Unesite vrednost za n: ");
        int n = Integer.parseInt(ulaz.readLine());
        if (n < 100) {
            
            for (int i = 1; i <= n; i++)
            if (i != 3)
                s += (i + 3.5) / (i - 3.0);
            
            System.out.println("Dobijena vrednost sume je " + df.format(s));
        }
	}

}
