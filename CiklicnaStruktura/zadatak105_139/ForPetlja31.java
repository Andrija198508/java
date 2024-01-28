package zadatak105_139;

import java.io.*;

public class ForPetlja31 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		int sp = 0, sn = 0;
        BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Unesite vrednost za n: ");
        int n = Integer.parseInt(ulaz.readLine());
        System.out.println("Unos celih brojeva: ");
        for (int i = 1; i <= n; i++) {
            
            System.out.println(i + ". broj");
            int m = Integer.parseInt(ulaz.readLine());
            
            if (m > 0)
            sp += m;
            else
            sn += m;
        }
        
        System.out.println("Zbir pozitivnih brojeva je " + sp + " a negativnih " + sn);
	}

}
