package zadatak62_91;

import java.io.*;

public class NajveciBroj {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

		double a, b, c, max;
		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Unesite a:");
		a = Double.parseDouble(ulaz.readLine());
		System.out.println("Unesite b:");
		b = Double.parseDouble(ulaz.readLine());
		System.out.println("Unesite c:");
		c = Double.parseDouble(ulaz.readLine());
		
		max = a;
		
		if(max == b && max == c)
			System.out.println("Nema najvećeg broja jer su svi isti");
		else {
			if(max < b)
				max = b;
			if(max < c)
				max = c;
			System.out.println("Najveći broj je " + max);
		}
			
	}

}
