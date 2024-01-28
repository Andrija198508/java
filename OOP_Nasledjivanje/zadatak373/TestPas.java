package zadatak373;

public class TestPas {

	public static void main(String[] args) {
		Pas p = new Pas();
		p.laj();
		p.dahci();
		
		ZlatniRetriver zr = new ZlatniRetriver();
		zr.aportiraj();
		zr.laj();
		zr.dahci();
		
		LhasaApso la = new LhasaApso();
		la.cuvaj();
		la.laj();
		la.dahci();
	}

}
