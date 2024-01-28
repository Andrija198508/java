package zadatak374;

public class TestSisar {

	public static void main(String[] args) {
		Pas p = new Pas();
		Macka m = new Macka();
		
		p.lajati();
		System.out.println("Boja očiju: " + p.uzmiBojuOciju());
		m.mjaukati();
		System.out.println("Boja očiju: " + m.uzmiBojuOciju());
	}

}
