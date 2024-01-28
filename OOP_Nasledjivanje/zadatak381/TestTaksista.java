package zadatak381;

public class TestTaksista {

	public static void main(String[] args) {
		HonorarniTaksista ht = new HonorarniTaksista();
		
		ht.zadajIme("Žika");
		System.out.println(ht.uzimIme());
		ht.zadajHonorarneSate(20);
		System.out.println(ht.uzmiHonorarneSate() + "\n" + Taksista.uzmiImeKompanije());
	}

}
