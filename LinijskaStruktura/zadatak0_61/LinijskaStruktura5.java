package zadatak0_61;

import java.io.*;

public class LinijskaStruktura5 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

		double a, p, v;
		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Unesite stranicu kocke a: ");
		a = Double.parseDouble(ulaz.readLine());
		
		p = 6 * a * a;
		v = Math.pow(a, 3);
		
		System.out.println("Površina kocke: " + p + "\nZapremina kocke: " + v);
	}

}
