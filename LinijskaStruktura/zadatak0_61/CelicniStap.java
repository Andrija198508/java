package zadatak0_61;

import java.io.*;
import java.text.DecimalFormat;

public class CelicniStap {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

		//A - površina poprečnog preseka štapa
		//L - dužina štapa
		//E - modul elastičnosti materijala
		//deltaL - izduženje štapa
		//deltaA - kontrakcija
		//F - intenzitet aksijalne sile
		//mi - Poasonov koeficijent
		
		double A, L, E, deltaL, deltaA, F, mi;
		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
		DecimalFormat df = new DecimalFormat("#.##");
		
		System.out.println("Unesite vrednost površine poprečnog preseka štapa A: ");
		A = Double.parseDouble(ulaz.readLine());
		System.out.println("Unesite vrednost dužine štapa L(cm): ");
		L = Double.parseDouble(ulaz.readLine());
		System.out.println("Unesite vrednost modula elastičnosti E: ");
		E = Double.parseDouble(ulaz.readLine());
		System.out.println("Unesite vrednost izduženja štapa(cm): ");
		deltaL = Double.parseDouble(ulaz.readLine());
		System.out.println("Unesite vrednost kontrakcije(cm): ");
		deltaA= Double.parseDouble(ulaz.readLine());
		
		F = A * E * deltaL / L;
		mi = L * deltaA / (A * deltaL);
		
		System.out.println("Intenzitet aksijalne sile je F = " + df.format(F) + "kn\nVrednost Poasonovog koeficijenta je: " + df.format(mi));
	}

}
