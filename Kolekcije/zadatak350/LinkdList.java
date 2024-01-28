package zadatak350;

import java.util.LinkedList;
import java.util.List;

public class LinkdList {

	public static void main(String[] args) {
		List ll = new LinkedList();
		ll.add("A");
		ll.add("B");
		ll.add("C");
		
		System.out.println("Elementi liste ll su: " + ll);
		
		ll.remove("B");
		ll.remove(0);
		
		System.out.println("Povezana lista nakon brisanja: " + ll);
		
		ll.add("D");
		ll.add("E");
		ll.add("F");
		
		System.out.println("Elementi povezane liste su: " + ll);
		
		Object element = ll.get(3);
		System.out.println("Traženi element je: " + element);
		
		ll.set(1, "Z");
		System.out.println("Lista nakon promena: " + ll);
	}

}
