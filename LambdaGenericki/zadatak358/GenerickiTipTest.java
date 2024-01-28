package zadatak358;

public class GenerickiTipTest {

	public static void main(String[] args) {
		GenerickiTip<Integer> intObjekat = new GenerickiTip<Integer>(100);
		intObjekat.prikaziTip();
		int i = intObjekat.getOb();
		System.out.println("Vrednost: " + i);
		
		System.out.println();
		
		GenerickiTip<String> stringObjekat = new GenerickiTip<String>("tekst");
		stringObjekat.prikaziTip();
		String str = stringObjekat.getOb();
		System.out.println("Vrednost: " + str);
	}

}
