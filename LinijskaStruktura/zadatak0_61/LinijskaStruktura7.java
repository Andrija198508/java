package zadatak0_61;

import java.io.*;

public class LinijskaStruktura7 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

		int n, s, d, j, zbir;
		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Unesite trocifreni broj:");
		n = Integer.parseInt(ulaz.readLine());
		
		s = n / 100;
		d = (n - s * 100) / 10;
		j = n - s * 100 - d * 10;
		
		zbir = s + d + j;
		
		System.out.println("Zbir cifara trocifrenog broja je: " + zbir);
	}

}
