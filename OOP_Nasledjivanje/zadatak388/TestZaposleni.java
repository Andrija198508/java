package zadatak388;

public class TestZaposleni {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Referent r = new Referent(160.0, 100.0, 10000.0);
		Programer p = new Programer(160.0, 120.0, 8200.0, 1500.0);
		
		System.out.println("Plata referenta je  " + r.izracunajPlatu());
		System.out.println("Plata programera je " + p.izracunajPlatu());
	}

}
