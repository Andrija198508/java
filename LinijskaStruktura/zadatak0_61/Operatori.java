package zadatak0_61;

public class Operatori {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 5;
		int b = 50;
		
		int zbir = a + b;
		System.out.println("Vrendost promenljive zbir je: " + zbir);
		
		int razlika = a - b;
		System.out.println("Razlika = " + razlika);
		
		int proizvod = a * b;
		System.out.println("Proizvod = " + proizvod);
		
		float kolicnik = 13 / 3;
		System.out.println("Količnik = " + kolicnik);
		
		int ostatak = 17 % 3;
		System.out.println("Ostatak = " + ostatak);
		
		float tacnoDeljenje = 17f / 3f;
		System.out.println("Tačno deljenje: " + tacnoDeljenje);
		
		double provera = (double) 17 / 3;
		System.out.println("Provera = " + provera);
	}

}
