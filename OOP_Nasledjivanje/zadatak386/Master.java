package zadatak386;

public class Master extends Kartica{
	
	int pinKod;
	
	Master(String tipKartice, String imeVlasnika, int pinKod){
		super(tipKartice, imeVlasnika);
		this.pinKod = pinKod;
	}
	
	public void ispisi() {
		super.ispisi();
		System.out.println("Pin kod: " + pinKod);
	}
}
