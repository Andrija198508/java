package zadatak62_91;

import java.io.*;

public class RazgranataStruktura5 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Unesite vrednost za q:");
		int q = Integer.parseInt(ulaz.readLine());
		System.out.println("Unesite vrednost za r:");
		int r = Integer.parseInt(ulaz.readLine());
		System.out.println("Unesite vrednost za s:");
		int s = Integer.parseInt(ulaz.readLine());
		
		int y = (r > s) ? r : s;
		if(q < y)
			y = q;
		System.out.println("Vrednost funkcije y je " + y);
	}

}
