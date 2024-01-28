package zadatak364;

public class Thread03Test {

	public static void main(String[] args) {
		Thread03 a1 = new Thread03("Nit1");
		Thread03 a2 = new Thread03("Nit2");
		Thread03 a3 = new Thread03("Nit3");
		
		a1.start();
		a2.start();
		a3.start();
	}

}
