package zadatak62_91;

import java.io.*;

public class IfStruktura {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Unesite vrednost za x:");
		int x = Integer.parseInt(ulaz.readLine());
		System.out.println("Unesite vrednost za y:");
		int y = Integer.parseInt(ulaz.readLine());
		System.out.println("Unesite vrednost za p:");
		int p = Integer.parseInt(ulaz.readLine());
		System.out.println("Unesite vrednost za q:");
		int q = Integer.parseInt(ulaz.readLine());
		
		int f = (p < q) ? p : q;
		if(y > f)
			f = y;
		if(x < f)
			f = x;
		System.out.println("Vrednost funkcije f je " + f);
	}

}
