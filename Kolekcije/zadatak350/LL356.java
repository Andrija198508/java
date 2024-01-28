package zadatak350;

import java.util.LinkedList;
import java.util.List;

public class LL356 {

	public static void main(String[] args) {
		String niz[] = {"Mika", "Zika", "Fica"};
		
		List<String> listaImena = new LinkedList<String>();
		
		for(String s : niz) {
			listaImena.add(s);
		}
		
		String niz2[] = {"Ana", "Lena", "Hana", "Una"};
		
		List<String> listaImena2 = new LinkedList<String>();
		
		for(String s : niz2) {
			listaImena2.add(s);
		}
		
		listaImena2.addAll(listaImena);
		System.out.println(listaImena2);
		
		
		System.out.println(listaImena2.subList(1, 4));
		
		listaImena2.subList(1, 4).clear();
		System.out.println(listaImena2);
	}

	private static Object subList(int i, int j) {
		// TODO Auto-generated method stub
		return null;
	}

}
