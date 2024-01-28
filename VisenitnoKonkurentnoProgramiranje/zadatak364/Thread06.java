package zadatak364;

public class Thread06 extends Thread{
		public void run() {
			int i = 1;
			
			while(i <= 5) {
				System.out.println("i: " + i);
				
				try {
					Thread.sleep(500);
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
				i++;
			}
		}
}
