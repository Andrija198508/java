package zadatak105_139;

import java.io.*;
import java.text.DecimalFormat;

public class ForPetlja20 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

		DecimalFormat df = new DecimalFormat("#.###");
        BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
    
        double s = 0;
    
        System.out.print("Unesite vrednost za n: ");
        int n = Integer.parseInt(ulaz.readLine());
     
        for (int i = 1; i <= n; i++)
            s = Math.sqrt(6 + s);
    
        System.out.println("Dobijena vrednost sume je " + df.format(s));
	}

}
