package zadatak364;

public class Thread04Test {

	public static void main(String[] args) {
		Thread04A a = new Thread04A("Nit1");
		Thread04B b = new Thread04B("Nit2");
		Thread04C c = new Thread04C("Nit3");
		
		a.start();
		b.start();
		c.start();
	}

}
