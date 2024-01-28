package zadatak0_61;

import java.io.*;
import java.text.DecimalFormat;

public class Dekart {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

		double f, alfa, x, y;
		DecimalFormat df = new DecimalFormat("#.##");
		
		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Unesite vrednost za intenzitet sile F(kn): ");
		f = Double.parseDouble(ulaz.readLine());
		System.out.println("Unesite vrednost za ugao alfa u stepenima: ");
		alfa = Math.toRadians(Double.parseDouble(ulaz.readLine()));
		
		x = f * Math.cos(alfa);
		y = f * Math.sin(alfa);
		
		System.out.println("Vrednosti Dekartovih koordinata su: X = " + df.format(x) + " i Y = " + df.format(y));
	}

}
