package zadatak395;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Boje: ");
		
		Boje nizBoja[] = Boje.values();
		
		for(Boje bb : nizBoja) {
			System.out.println(bb + " ");
		}
		
		Boje c1;
		
		c1 = Boje.valueOf("Bela");
		
		System.out.println("\nTražena boja: " + c1);
	}

}
