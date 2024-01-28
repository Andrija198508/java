package zadatak388;

public class Programer extends Zaposleni{
	
	double bonus;
	double prekovremeniRad;
	
	Programer(double brojRadnihSati, double cenaRadnogSata, double bonus, double prekovremeniRad){
		this.brojRadnihSati = brojRadnihSati;
		this.cenaRadnogSata = cenaRadnogSata;
		this.bonus = bonus;
		this.prekovremeniRad = prekovremeniRad;
	}
	
	public double izracunajPlatu() {
		return brojRadnihSati * cenaRadnogSata + bonus + prekovremeniRad;
	}
}
