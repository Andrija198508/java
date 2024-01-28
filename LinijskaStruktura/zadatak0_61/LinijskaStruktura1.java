package zadatak0_61;

import java.io.*;

public class LinijskaStruktura1 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

		double x, y, z, f;
		
		BufferedReader ulaz = new BufferedReader (new InputStreamReader(System.in));
		System.out.println("Unesite vrednost x: ");
		x = Double.parseDouble(ulaz.readLine());
		System.out.println("Unesite vrednost y: ");
		y = Double.parseDouble(ulaz.readLine());
		System.out.println("Unesite vrednost z: ");
		z = Double.parseDouble(ulaz.readLine());
		
		f = Math.pow((x + 3 * z + y) / 2 * x, 4) - x / (x + 3 * z - y);
		System.out.println("Vrednost funkcije f: " + f);
	}

}
