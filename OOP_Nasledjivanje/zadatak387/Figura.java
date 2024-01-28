package zadatak387;

public abstract class Figura {
	
	protected double xRef;
	protected double yRef;
	
	Figura(double xRef, double yRef) {
		if(xRef != 0 || yRef != 0) {
			this.xRef = xRef;
			this.yRef = yRef;
		}
		else
			System.out.println("Greška: Vrednosti podataka ne mogu biti 0.0");
	}
	
	abstract double obim();
	abstract double povrsina();
}
