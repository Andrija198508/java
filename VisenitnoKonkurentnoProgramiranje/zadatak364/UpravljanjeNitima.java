package zadatak364;

public class UpravljanjeNitima {

	public static void main(String[] args) {
		Thread t = Thread.currentThread();
		
		System.out.println("Trenutna nit: " + t);
		
		System.out.println("Naziv niti: " + Thread.currentThread().getName());
		System.out.println("Prioritet niti: " + Thread.currentThread().getPriority());
	}

}
