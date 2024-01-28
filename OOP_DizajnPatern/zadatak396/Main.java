package zadatak396;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Udeo Zelene boje: " + Boje.Zelena.getUdeo());
		
		System.out.println("Sve boje: ");
		for(Boje bb : Boje.values()) {
			System.out.println(bb + " " + bb.getUdeo());
		}
	}

}
