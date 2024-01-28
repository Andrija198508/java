package zadatak364;

public class Thread06Test {

	public static void main(String[] args) throws InterruptedException{
		Thread06 a = new Thread06();
		
		a.start();
		
		String[] korpaVoca = {"Limun", "Mandarina", "Jabuka"};
		for(String vocka: korpaVoca) {
			System.out.println(vocka);
			Thread.sleep(500);
		}
	}

}
