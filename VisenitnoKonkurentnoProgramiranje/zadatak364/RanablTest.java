package zadatak364;

public class RanablTest {

	public static void main(String[] args) {
		Ranable r = new Ranable();
		
		Thread t1 = new Thread(r, "Nit1");
		Thread t2 = new Thread(r, "Nit2");
		Thread t3 = new Thread(r, "Nit3");
		
		t1.start();
		t2.start();
		t3.start();
		
		System.out.println(Runtime.getRuntime().availableProcessors() + " procesora ima na kompu.");
	}

}
