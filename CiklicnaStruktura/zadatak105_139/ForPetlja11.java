package zadatak105_139;

public class ForPetlja11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int broj, s, d, j;
		
		for(int i = 100; i < 1000; i++) {
			broj = i;
			s = broj / 100;
			d = (broj / 10) % 10;
			j = broj % 10;
			
			if(broj == (s * s * s + d * d * d + j * j * j)) {
				System.out.println("Dati broj " + broj + " je Armstrongov broj.");
			}
		}
	}

}
