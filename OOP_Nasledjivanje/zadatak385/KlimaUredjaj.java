package zadatak385;

public class KlimaUredjaj extends Uredjaj{
	
	int temperatura = 18;
	
	public KlimaUredjaj(String marka, boolean ukljucen, int temperatura) {
		super(marka, ukljucen);
		if(temperatura >= 18 && temperatura <= 30)
			this.temperatura = temperatura;
		else
			System.out.println("Greška: Vrednost podatka temperatura mora biti između 18 i 30");
	}
	
	public void povecajTemperaturu() {
		if(temperatura < 30)
			temperatura++;
		else
			temperatura = 18;
	}
	
	public void smanjiTemperaturu() {
		if(temperatura > 18)
			temperatura--;
		else
			temperatura = 30;
	}
	
	public void ispisi() {
		super.ispisi();
		System.out.println("Trenutna temperatura je " + temperatura);
	}
}
