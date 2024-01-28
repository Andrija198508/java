package zadatak105_139;

public class ForPetlja08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char slovo = 'A';
		
		for(int i = 1; i <= 26; i++) {
			if(slovo >= 'A' && slovo <= 'Z') {
				System.out.println(slovo);
				slovo++;
			}
		}
	}

}
