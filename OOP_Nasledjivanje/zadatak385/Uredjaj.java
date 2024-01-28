package zadatak385;

public class Uredjaj {
	
	String marka;
	boolean ukljucen;
	
	public Uredjaj(String marka, boolean ukljucen) {
		if(marka.isBlank() || marka.isEmpty())
			System.out.println("Greška: Vrednost podatka marka ne sme biti null.");
		else {
			this.marka = marka;
			this.ukljucen = ukljucen;
		}
	}
	
	public String getMarka() {
		return marka;
	}
	
	public void setMarka(String marka) {
		if (marka.isBlank() || marka.isEmpty())
			System.out.println("Greška: Vrednost podatka marka ne sme biti null.");
		else
			this.marka = marka;
	}
	
	public void ukljuci() {
		ukljucen = true;
	}
	
	public void iskljucen() {
		ukljucen = false;
	}
	
	public void ispisi() {
		System.out.println("Marka: " + marka);
		if(ukljucen)
			System.out.println("Uređaj je uključen.");
		else
			System.out.println("Uređaj je isključen.");
	}
}
