package zadatak385;

public class TestUredjaj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Uredjaj u = new Uredjaj("Samsung", true);
		KlimaUredjaj k = new KlimaUredjaj("Gorenje", false, 25);
		u.iskljucen();
		System.out.println("Podaci o uređaju: ");
		u.ispisi();
		k.ukljuci();
		k.povecajTemperaturu();
		System.out.println("\nPodaci o klima uređaju: ");
		k.ispisi();
	}

}
