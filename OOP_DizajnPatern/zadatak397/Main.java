package zadatak397;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Boja - redni broj");
		
		for(Boje bb : Boje.values()) {
			System.out.println(bb + " " + bb.ordinal());
		}
		
		System.out.println();
		
		Boje b1, b2, b3, b4;
		
		b1 = Boje.Crvena;
		b2 = Boje.Zelena;
		b3 = Boje.Plava;
		b4 = Boje.Crvena;
		
		if(b1.compareTo(b2) < 0) {
			System.out.println(b1 + " dolazi pre " + b2);
		}
		if(b1.compareTo(b2) > 0) {
			System.out.println(b2 + " dolazi pre " + b1);
		}
		if(b1.compareTo(b1) == 0) {
			System.out.println(b1 + " jednako " + b1);
		}
		
		if(b1.equals(b2)) {
			System.out.println("Greška");
		}
		if(b1.equals(b3)) {
			System.out.println(b1 + " jednako " + b3);
		}
		if(b1 == b4) {
			System.out.println(b1 + " jednako " + b4);
		}
	}

}
