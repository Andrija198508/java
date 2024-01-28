package zadatak62_91;

import java.io.*;

public class DeljivSa2i3 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

		int broj;
		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Unesite broj:");
		broj = Integer.parseInt(ulaz.readLine());
		
		if(broj % 2 == 0 && broj % 3 == 0) {
			System.out.println("Broj je deljiv i sa dva i sa tri.");
		}else {
			System.out.println("Uneti broj nije deljiv i sa dva i sa tri.");
		}
	}

}
