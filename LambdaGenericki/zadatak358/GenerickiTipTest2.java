package zadatak358;

public class GenerickiTipTest2 {

	public static void main(String[] args) {
		GenerickiTip2<Integer, String> objekat1 = new GenerickiTip2<Integer, String>(100, "Java");
		GenerickiTip2<String, Double> objekat2 = new GenerickiTip2<String, Double>("Java", 100.00);
		GenerickiTip2<Boolean, Integer> objekat3 = new GenerickiTip2<Boolean, Integer>(true, 100);
		
		objekat1.prikaziTip();
		objekat2.prikaziTip();
		objekat3.prikaziTip();
	}

}
