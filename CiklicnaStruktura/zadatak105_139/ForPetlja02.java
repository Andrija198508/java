package zadatak105_139;

public class ForPetlja02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.printf("%8s%8s%8s \n", "Broj", "Kvadrat", "Kub");
		
		for(int broj = 1; broj <= 5; broj++) {
			System.out.printf("%8d%8d%8d \n", broj, broj * broj, broj * broj * broj);
		}
	}

}
