package zadatak364;

public class Thread03 extends Thread{
		Thread03(String s){
			super(s);
		}
		
		public void run() {
			for(int i = 1; i < 5; i++) {
				System.out.println(getName());
			}
		}
}
