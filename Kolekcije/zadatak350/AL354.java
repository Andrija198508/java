package zadatak350;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AL354 {

	public static void main(String[] args) {
		String imena[] = {"Mika", "Zika", "Ana", "Lana", "Hana", "Una"};
		
		List<String> listaImena = new ArrayList<String>();
		
		for(String s : imena) {
			listaImena.add(s);
		}
		
		for(String s : listaImena) {
			System.out.printf("%s ", s);
		}
		
		String imenaZaBrisanje[] = {"Mika", "Lana", "Hana"};
		
		for(String s : imenaZaBrisanje) {
			listaImena.remove(s);
		}
		
		System.out.println("\n\nNovi izgled: ");
		for(String s : listaImena) {
			System.out.printf("%s ", s);
		}
		
		Iterator iter = listaImena.iterator();
		System.out.println("\n\nŠtampanje elemenata pomoću iteratora!");
		while(iter.hasNext()) {
			System.out.print(iter.next() + " ");
		}
		
		List listaImenaZaBrisanje = new ArrayList();
		
		listaImenaZaBrisanje.add("Una");
		iter = listaImena.iterator();
		while(iter.hasNext())
			if(listaImenaZaBrisanje.contains(iter.next()));
		iter.remove();
		
		System.out.println("\n\nLista nakon drugog brisanja: ");
		for(int i = 0; i < listaImena.size(); i++) {
			System.out.print(listaImena.get(i) + " ");
		}
	}

}
