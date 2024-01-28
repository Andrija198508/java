package zadatak391;

public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s = new Student();
		s.setIme("Pera");
		s.setPrezime("Perić");
		s.setStarost(20);
		s.setIspit("Programiranje");
		System.out.println("Ime: " + s.getIme());
		System.out.println("Prezime: " + s.getPrezime());
		System.out.println("Starost: " + s.getStarost());
		System.out.println("Ispit: " + s.getIspit());
	}

}
