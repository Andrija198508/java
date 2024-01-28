package zadatak391;

public class Osoba {
	
	String ime = "N";
	String prezime = "N";
	int starost = 0;
	
	public String getIme() {
		return ime;
	}
	
	public void setIme(String ime) {
		if(ime.isBlank() || ime.isEmpty())
			System.out.println("Greška: Vrednost podatka ime ne sme biti null.");
		else
			this.ime = ime;
	}
	
	String getPrezime() {
		return prezime;
	}
	
	public void setPrezime(String prezime) {
		if(prezime.isBlank() || prezime.isEmpty())
			System.out.println("Greška: Vrednost podatka prezime ne sme biti null.");
		else
			this.prezime = prezime;
	}
	
	public int getStarost() {
		return starost;
	}
	
	public void setStarost(int starost) {
		if(starost <= 0)
			System.out.println("Greška: Vrednost podatka starost mora biti veća od nule.");
		else
			this.starost = starost;
	}
}
