package zadatak398;

public class EnumPrikaz {

	static void odgovor(Odgovori odg) {
		switch(odg) {
		case NE:{
			System.out.println("NE");
			break;
		}
		case DA:{
			System.out.println("DA");
			break;
		}
		case MOZDA:{
			System.out.println("MOZDA");
			break;
		}
		case KASNIJE:{
			System.out.println("KASNIJE");
			break;
		}
		case USKORO:{
			System.out.println("USKORO");
			break;
		}
		case NIKAD:{
			System.out.println("NIKAD");
			break;
		}
		}
	}
}
