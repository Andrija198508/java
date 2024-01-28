package zadatak379;
import java.util.Stack;
public class TestOblik {
	public static void main(String[] args) {
	Krug k = new Krug(1);
	Pravougaonik p = new Pravougaonik(4, 5);
	Stack stek = new Stack();
	stek.push(k);
	stek.push(p);
	
	while(!stek.empty()) {
		Oblik oblik = (Oblik) stek.pop();
		System.out.println("Površina je " + oblik.uzmiPovrsinu());
	}
	}

}
