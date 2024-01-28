package zadatak0_61;

import java.io.*;

public class Buffer {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

		double x;
		
		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Unesite vrednost za X: ");
		x = Double.parseDouble(ulaz.readLine());
		System.out.println("X je: " + x);
	}

}
