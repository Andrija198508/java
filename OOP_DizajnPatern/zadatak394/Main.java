package zadatak394;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Boje b;
		
		b = Boje.CRVENA;
		System.out.println("Boja je: " + b);
		
		b = Boje.PLAVA;
		
		if(b == Boje.PLAVA) {
			System.out.println("Plava");
		}
		
		switch(b) {
		case CRVENA:{
			System.out.println("Crvena");
			break;
		}
		case ZELENA:{
			System.out.println("Zelena");
			break;
		}
		case PLAVA:{
			System.out.println("Plava");
			break;
		}
		case CRNA:{
			System.out.println("Crna");
			break;
		}
		case BELA:{
			System.out.println("Bela");
			break;
		}
		case ZUTA:{
			System.out.println("Zuta");
			break;
		}
		case NARANDZASTA:{
			System.out.println("Narandzasta");
			break;
		}
		default:
			System.out.println("Nema boje");
		}
	}

}
