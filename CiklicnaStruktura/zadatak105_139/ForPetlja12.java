package zadatak105_139;

public class ForPetlja12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int brojac = 0;
		for(int i = 1; i <= 20; i++) {
			if(i % 3 == 0) {
				brojac++;
			}
		}
		
		System.out.println("Između 1 i 20 ima " + brojac + " brojeva deljivih sa 3");
	}

}
