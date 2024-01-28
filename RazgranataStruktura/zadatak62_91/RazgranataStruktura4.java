package zadatak62_91;

import java.io.*;

public class RazgranataStruktura4 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

		double x;
		boolean y;
		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Unesite vrednost za x:");
		x = Double.parseDouble(ulaz.readLine());
		
		if(x >= 1) {
			y = Math.sqrt((2 + x - Math.pow(x, 3)) / (x + 2)) > 0 || Math.exp(x) < x - 1 && Math.sqrt(x - 1) <= 0;
			System.out.println("Vrednost funkcije y je " + y);
		}else {
			System.out.println("Unos vrednosti za podatak x nije ispravan, x mora biti različito od 1.");
		}
	}

}
