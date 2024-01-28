package zadatak0_61;

import java.io.*;
import java.text.DecimalFormat;

public class LinijskaStruktura6 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

		double a, b, c, s, p, R, r, d;
		DecimalFormat df = new DecimalFormat("#.##");
		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Unesite vrednost za a: ");
		a = Double.parseDouble(ulaz.readLine());
		System.out.println("Unesite vrednost za b: ");
		b = Double.parseDouble(ulaz.readLine());
		System.out.println("Unesite vrednost za c: ");
		c = Double.parseDouble(ulaz.readLine());
		
		s = (a + b + c) / 2;
		p = Math.sqrt(s * (s -a) * (s - b) * (s - c));
		R = a * b * c / (4 * p);
		r = a * b * c / (2 * R * s);
		d = Math.sqrt(R * (R - 2 * r));
		
		System.out.println("R = " + df.format(R) + "\tr = " + df.format(r) + "\td = " + df.format(d));
	}

}
