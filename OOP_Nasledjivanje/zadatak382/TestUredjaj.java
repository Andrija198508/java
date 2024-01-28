package zadatak382;

public class TestUredjaj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Uredjaj u = new Uredjaj("Samsung", true);
		
		MasinaZaVes k = new MasinaZaVes("Gorenje", false, 2, 30);
		u.iskljuci();
		System.out.println("Podaci o uredjaju: ");
		u.ispisi();
		k.ukljuci();
		k.promeniProgramNaVise();
		System.out.println("\nPodaci o mašini za veš: ");
		k.ispisi();
	}

}
