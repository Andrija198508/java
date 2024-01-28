package zadatak364;

public class Thread04C extends Thread{
		Thread04C(String s){
			super(s);
		}
		
		public void run() {
			for(int i = 1; i < 11; i++) {
				System.out.println(getName());
			}
		}
}
