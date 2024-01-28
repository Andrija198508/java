package zadatak387;

public class Pravougaonik extends Figura{
	
	Pravougaonik(double duzina, double sirina){
		super(duzina, sirina);
	}
	
	double obim() {
		return 2 * xRef + 2 * yRef;
	}
	
	double povrsina() {
		return xRef * yRef;
	}
}
