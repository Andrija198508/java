package zadatak62_91;

import java.io.*;

public class RazgranataStruktura2 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

		double a, b, c;
		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Unesite dužinu odsečka a: ");
		a = Double.parseDouble(ulaz.readLine());
		System.out.println("Unesite dužinu odsečka b: ");
		b = Double.parseDouble(ulaz.readLine());
		System.out.println("Unesite dužinu odsečka c: ");
		c = Double.parseDouble(ulaz.readLine());
		
		if((a + b > c) && (a + c > b) && (b + c > a)) {
			double p = 0.25 * Math.sqrt((a + b + c) * (b + c - a) * (a + c - b) * (a + b - c));
			System.out.println("Površina trougla je " + p);
		}else
			System.out.println("Unete stranice ne čine trougao");
	}

}
