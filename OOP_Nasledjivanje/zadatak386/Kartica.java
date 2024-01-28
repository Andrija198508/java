package zadatak386;

public class Kartica {
	
	protected String tipKartice;
	protected String imeVlasnika;
	
	Kartica(String tipKartice, String imeVlasnika){
		this.tipKartice = tipKartice;
		this.imeVlasnika = imeVlasnika;
	}
	
	public void ispisi() {
		System.out.println("Tip kartice: " + tipKartice);
		System.out.println("Ime vlasnika: " + imeVlasnika);
	}
}
