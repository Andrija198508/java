package zadatak62_91;

import java.io.*;
import java.text.DecimalFormat;

public class RazgranataStruktura3 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

		double x, y, z, f;
		DecimalFormat df = new DecimalFormat("#.##");
		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Unesite vrednost za x:");
		x = Double.parseDouble(ulaz.readLine());
		System.out.println("Unesite vrednost za y:");
		y = Double.parseDouble(ulaz.readLine());
		System.out.println("Unesite vrednost za z:");
		z = Double.parseDouble(ulaz.readLine());
		
		if(2 * x != y) {
			f = (x + y) * (x + z) / (2 * x - y);
			System.out.println("Vrednost funkcije f je: " + df.format(f));
		}else {
			System.out.println("Unos podataka nije ispravan, y se mora razlikovati od 2x.");
		}
	}

}
