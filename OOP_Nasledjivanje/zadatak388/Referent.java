package zadatak388;

public class Referent extends Zaposleni{
	
	double bonus;
	
	Referent(double brojRadnihSati, double cenaRadnogSata, double bonus){
		this.brojRadnihSati = brojRadnihSati;
		this.cenaRadnogSata = cenaRadnogSata;
		this.bonus = bonus;
	}
	
	public double izracunajPlatu() {
		return brojRadnihSati * cenaRadnogSata + bonus;
	}
}
