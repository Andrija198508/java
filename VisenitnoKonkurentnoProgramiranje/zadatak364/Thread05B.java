package zadatak364;

public class Thread05B extends Thread{
	public void run() {
		for(int i = 1; i < 16; i++) {
			System.out.println("Nit B: " + i);
		}
		System.out.println("Kraj izvršavanja niti B.");
	}
}
