package zadatak105_139;

public class ForPetlja09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Prvi način: ");
		for(int i = 1; i <= 100; i++) {
			if(i % 2 == 0) {
				System.out.println(i + " ");
			}
		}
		
		System.out.println("Drugi način: ");
		for(int i = 2; i <= 100; i += 2) {
			System.out.println(i + " ");
		}
	}

}
