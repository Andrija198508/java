package zadatak105_139;

import java.io.*;
import java.text.DecimalFormat;

public class ForPetlja19 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

		double suma = 0;
        DecimalFormat df = new DecimalFormat("#.###");
        BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Unesite vrednost za n: ");
        int n = Integer.parseInt(ulaz.readLine());
        for (int i = 1; i <= n; i++)
            suma += (double) i / (i + 1);
        System.out.println("Dobijena vrednost sume je " + df.format(suma));
	}

}
