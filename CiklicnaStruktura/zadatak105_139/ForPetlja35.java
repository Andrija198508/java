package zadatak105_139;

import java.io.*;
import java.text.DecimalFormat;

public class ForPetlja35 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		double q0, L, m, ft;
		DecimalFormat df = new DecimalFormat("#.##");
		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Unesite vrednost za trougaono opterecenje q0: ");
		q0 = Double.parseDouble(ulaz.readLine());
		System.out.print("Unesite vrednost za duzinu grede L: ");
		L = Double.parseDouble(ulaz.readLine());
		
		System.out.println("\tz\tFt\tM");
		
		for (double z = 2.5; z < 3.5; z += 0.1) {
		    ft = q0 * (L / 3.0 - z * z / L) / 2.0;
		    m = q0 * L * L * (z / L - Math.pow(z / L, 3.0)) / 6.0;
		    System.out.println("\t" + df.format(z) + "\t" + df.format(ft) + "\t" + df.format(m));
		}
	}

}
