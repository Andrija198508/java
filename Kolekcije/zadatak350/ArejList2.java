package zadatak350;

import java.util.ArrayList;
import java.util.List;

public class ArejList2 {

	public static void main(String[] args) {
		List<String> lista = new ArrayList<String>();
		
		System.out.println("Početna dužina: " + lista.size());
		
		lista.add("Prvi");
		lista.add("Drugi");
		lista.add("Treci");
		lista.add("Cetvrti");
		
		for(String s : lista){
			System.out.printf("%s ", s);
		}
		
		System.out.println("\nTrenutna dužina kolekcije: " + lista.size());
		
		boolean sadrzi = lista.contains("Treci");
		if(sadrzi) {
			System.out.println("Traženi element se nalazi u zadatoj kolekciji");
		}else {
			System.out.println("Traženi element se ne nalazi u zadatoj kolekciji");
		}
		
		String element = lista.get(2);
		System.out.println("Element sa indeksom 2 u kolekciji je: " + element);
		
		int pozicija = lista.indexOf("Drugi");
		System.out.println("Element Drugi je na poziciji: " + pozicija);
		
		String[] nizString = new String[lista.size()];
		lista.toArray(nizString);
		
		for(String s : nizString) {
			System.out.printf("%s ", s);
		}
		
		System.out.println("\n\nUklanjanje elementa Treci: ");
		lista.remove("Treci");
		for(String s : lista) {
			System.out.printf("%s ", s);
		}
		
		lista.clear();
		System.out.println("\n\nVeličina kolekcije nakon brisanja: " + lista.size());
	}

}
