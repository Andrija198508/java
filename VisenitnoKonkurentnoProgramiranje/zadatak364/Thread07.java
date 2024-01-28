package zadatak364;

public class Thread07 implements Runnable{
		String ime;
		Thread t;
		
		Thread07(String name){
			ime = name;
			t = new Thread(this, ime);
			t.start();
		}
		
		public void run() {
			for(int i = 1; i <= 5; i++) {
				System.out.println(ime + " = " + i);
				try {
					Thread.sleep(500);
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
}
