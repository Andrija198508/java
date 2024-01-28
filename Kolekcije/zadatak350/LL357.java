package zadatak350;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LL357 {

	public static void main(String[] args) {
		List<String> listaImena = new LinkedList<String>();
		listaImena.add("1");
		listaImena.add("2");
		listaImena.add("3");
		listaImena.add("4");
		listaImena.add("5");
		
		ListIterator itr = listaImena.listIterator();
		
		while(itr.hasNext()) {
			System.out.print(itr.next());
		}
		System.out.println();
		while(itr.hasPrevious()) {
			System.out.print(itr.previous());
		}
		
	}

}
