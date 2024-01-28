package zadatak393;

public class Main {
	
	static void testPatka(Patka patka) {
		patka.kvace();
		patka.leti();
	}

	public static void main(String[] args) {

		DivljaPatka patka = new DivljaPatka();
		Curka curka = new DivljaCurka();
		
		Patka curkaAdapter = new CurkaAdapter(curka);
		
		System.out.println("Curka: ");
		curka.curlice();
		curka.leti();
		
		System.out.println("Patka: ");
		testPatka(patka);
		
		System.out.println("AdapterCurka");
		testPatka(curkaAdapter);
	}

}
