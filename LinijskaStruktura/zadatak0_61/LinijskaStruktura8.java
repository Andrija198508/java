package zadatak0_61;

import java.io.*;

public class LinijskaStruktura8 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

		double n;
		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Unesite dijagonalu ekrana u inčima: ");
		n = Double.parseDouble(ulaz.readLine());
		
		System.out.println("Dijagonala ekrana izražena u centimetrima je: " + n * 2.54);
	}

}
