package zadatak384;

public class Kocka extends GeometrijskoTelo{
	
	double stranica;
	
	public Kocka(double stranica) {
		if(stranica > 0.0)
			this.stranica = stranica;
		else
			System.out.println("Greška: Vrednost podatka stranica mora biti veća od nule.");
	}
	
	public double izracunajPovrsinu() {
		return stranica * stranica * 6;
	}
	
	public double izracunajZapreminu() {
		return stranica * stranica * stranica;
	}
}
