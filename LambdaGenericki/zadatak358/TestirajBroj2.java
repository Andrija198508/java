package zadatak358;

public class TestirajBroj2 {

	public static void main(String[] args) {
		TestirajBroj paranBroj = (n) -> (n % 2) == 0;
		
		if(paranBroj.test(10)) {
			System.out.println("Broj je paran.");
		}else {
			System.out.println("Broj nije paran.");
		}
	}

}
