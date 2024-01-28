package zadatak105_139;

import java.io.*;
import java.text.DecimalFormat;

public class ForPetlja22 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

		DecimalFormat df = new DecimalFormat("#.###");
		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
		
		double p = 1, q = 1;
		
		System.out.println("Unesite vrednost za n:");
		int n = Integer.parseInt(ulaz.readLine());
		
		for(int i = 2; i <= n; i++) {
			q *= i;
			p *= (1 + 1 / q);
		}
		
		System.out.println("Dobijena vrednost proizvoda je " + df.format(p));
	}

}
