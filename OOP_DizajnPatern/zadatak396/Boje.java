package zadatak396;

public enum Boje {

	Crvena(200), Zelena(150), Plava(100), Crna(250), Bela(179), Zuta(124);
	
	private int udeo;
	
	Boje(int u){
		udeo = u;
	}
	
	public int getUdeo() {
		return udeo;
	}
}
