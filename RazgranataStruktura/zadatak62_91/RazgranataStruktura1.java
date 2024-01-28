package zadatak62_91;

import java.io.*;
import java.text.DecimalFormat;

public class RazgranataStruktura1 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

		double x, y, f;
		DecimalFormat df = new DecimalFormat("#.##");
		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Unesite vrednost za x:");
		x = Double.parseDouble(ulaz.readLine());
		System.out.println("Unesite vrednost za y:");
		y = Double.parseDouble(ulaz.readLine());
		
		if(x > y)
			f = Math.sqrt((x - 0.2) / (2 + y));
		else
			f = Math.sqrt((y - 0.2) / (2 + x));
		System.out.println("Vrednost funkcije je " + df.format(f));
	}

}
