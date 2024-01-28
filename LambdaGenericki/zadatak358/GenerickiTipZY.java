package zadatak358;

public class GenerickiTipZY {
	
	public static <T> void stampajNiz(T[] pocetniNiz) {
		for(T elemnt : pocetniNiz) {
		System.out.printf("%s ", elemnt);
		}
	}

	public static void main(String[] args) {
		Integer[] i = {1, 2, 3, 4, 5, 6, 7};
		Double[] d = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7};
		Character[] c = {'a', 'b', 'c', 'd', 'e'};
		
		System.out.println("Sadržaj celobrojnog niza:");
		stampajNiz(i);
		
		System.out.println("\n Sadržaj double niza:");
		stampajNiz(d);
		
		System.out.println("\nSadržaj niza karaktera:");
		stampajNiz(c);
	}

}
