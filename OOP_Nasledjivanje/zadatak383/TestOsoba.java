package zadatak383;

public class TestOsoba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Osoba os = new Osoba();
		
		os.setIme("Laza");
		os.setPrezime("Lazić");
		os.setMaticniBroj("1110977105617");
		
		System.out.println("Podaci o osobi: ");
		System.out.println("Ime osobe: " + os.getIme());
		System.out.println("Prezime osobe: " + os.getPrezime());
		System.out.println("Matični broj osobe: " + os.getMaticniBroj());
		
		Zaposleni z = new Zaposleni();
		
		z.setIme("Mika");
		z.setPrezime("Mikić");
		z.setMaticniBroj("1010988725376");
		z.setprosecnaZarada(18000);
		
		System.out.println("\nPodaci o zaposlenom: ");
		System.out.println("Ime zaposlenog: " + z.getIme());
		System.out.println("Prezime zaposlenog: " + z.getPrezime());
		System.out.println("Matični broj zaposlenog: " + z.getMaticniBroj());
		System.out.println("Prosečna zarada zaposlenog: " + z.getProsecnaZarada());
	}

}
