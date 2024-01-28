package zadatak383;

public class Zaposleni extends Osoba{
	
	int brojRadneKnjizice;
	double prosecnaZarada;
	
	public int getBrojRadneKnjizice() {
		return brojRadneKnjizice;
	}
	
	public void setBrojRadneKnjizice(int brojRadneKnjizice) {
		this.brojRadneKnjizice = brojRadneKnjizice;
	}
	
	public double getProsecnaZarada() {
		return prosecnaZarada;
	}
	
	public void setprosecnaZarada(double prosecnaZarada) {
		if (prosecnaZarada > 0.0)
			this.prosecnaZarada = prosecnaZarada;
		else
			System.out.println("Greška: vrednost podatka " + 
			"prosečna zarada mora biti veća od nule.");
	}

}
