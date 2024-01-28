package zadatak364;

public class Thread04A extends Thread{
		Thread04A(String s){
			super(s);
		}
		
		public void run() {
			for(int i = 1; i < 11; i++) {
				System.out.println(getName());
			}
		}
}
