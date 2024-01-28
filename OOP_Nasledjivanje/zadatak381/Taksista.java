package zadatak381;

public class Taksista {
	private static String imeKompanije = "Žuti taksi";
	private String ime;
	
	public Taksista(){
		ime = null;
	}
	
	public Taksista(String iIme) {
		ime = iIme;
	}
	
	public void zadajIme(String iIme) {
		ime = iIme;
	}
	
	public String uzimIme() {
		return ime;
	}
	
	public static String uzmiImeKompanije() {
		return imeKompanije;
	}
	
	public void zadajPravac() {
		System.out.println("Pravac");
	}
	
	public void skreniDesno() {
		System.out.println("Skreni desno");
	}
	
	public void skreniLevo() {
		System.out.println("Skreni levo");
	}
}
