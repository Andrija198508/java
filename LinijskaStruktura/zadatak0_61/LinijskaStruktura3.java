package zadatak0_61;

import java.io.*;
import java.text.DecimalFormat;

public class LinijskaStruktura3 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

		double x, y, z, f;
		DecimalFormat df = new DecimalFormat("#.##");
		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Unesite vrednost za x: ");
		x = Double.parseDouble(ulaz.readLine());
		System.out.println("Unesite vrednost za y: ");
		y = Double.parseDouble(ulaz.readLine());
		System.out.println("Unesite vrednost za z: ");
		z = Double.parseDouble(ulaz.readLine());
		
		f = (x + y) * (x + z) * Math.sin(x) / (2 * x - y);
		
		System.out.println("Vrednost funkcije f je: " + df.format(f));
	}

}
