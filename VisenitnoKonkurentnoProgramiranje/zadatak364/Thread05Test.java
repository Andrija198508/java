package zadatak364;

public class Thread05Test {

	public static void main(String[] args) {
		Thread05A a = new Thread05A();
		Thread05B b = new Thread05B();
		
		b.setPriority(Thread.MAX_PRIORITY);
		a.setPriority(Thread.MIN_PRIORITY);
		
		a.start();
		b.start();
		
		System.out.println("Kraj glavne niti.");
	}

}
