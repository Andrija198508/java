package zadatak364;

public class Thread05A extends Thread{
		public void run() {
			for(int i = 1; i < 4; i++) {
				System.out.println("Nit A: " + i);
			}
			System.out.println("Kraj izvršavanja niti A.");
		}
}
