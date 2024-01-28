package zadatak364;

public class Thread07Test {

	public static void main(String[] args) throws InterruptedException{
		Thread07 a1 = new Thread07("Nit1");
		System.out.println("Prva nit se izvršava: " + a1.t.isAlive());
		Thread07 a2 = new Thread07("Nit2");
		System.out.println("Druga nit se izvršava: " + a2.t.isAlive());
		Thread07 a3 = new Thread07("Nit3");
		System.out.println("Treća nit se izvršava: " + a3.t.isAlive());
		
		try {
			a1.t.join();
			a2.t.join();
			a3.t.join();
		}catch(Exception e) {
			
		}
		
		System.out.println("Prva nit se izvršava: " + a1.t.isAlive());
		System.out.println("Druga nit se izvršava: " + a2.t.isAlive());
		System.out.println("Treća nit se izvršava: " + a3.t.isAlive());
	}

}
