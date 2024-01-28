package zadatak393;

public class CurkaAdapter implements Patka{
	
	Curka curka;
	
	public CurkaAdapter(Curka curka) {
		this.curka = curka;
	}
	
	public void kvace() {
		curka.curlice();
	}
	
	public void leti() {
		for(int i = 0; i < 5; i++) {
			curka.leti();
		}
	}
}
