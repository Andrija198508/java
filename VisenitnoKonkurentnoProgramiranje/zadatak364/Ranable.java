package zadatak364;

public class Ranable implements Runnable{
		public void run() {
			for(int i = 1; i < 4; i++) {
				System.out.println(Thread.currentThread().getName());
			}
		}
}
