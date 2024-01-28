package zadatak0_61;

import java.util.Scanner;

public class UcitavanjeVrednosti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String ime;
		String izraz = "Andrija";
		System.out.println(izraz);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Kako se zovete?");
		ime = sc.nextLine();
		System.out.println("Vi se zovete: " + ime);
		
		System.out.println("Koliko imate godina?");
		int brojGodina = sc.nextInt();
		System.out.println("Imate godina: " + brojGodina);
		sc.close();
	}

}
