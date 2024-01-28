package zadatak0_61;

public class Inkrement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 3, j = 4;
		System.out.println("Pod a)\ni = " + i + ", j = " + j);
		j = 3 + --i;
		System.out.println("i = " + i + ", j = " + j);
		
		i = 3;
		j = 4;
		System.out.println("\nPod b)\ni = " + i + ", j = " + j);
		j = 3 + i--;
		System.out.println("i = " + i + ", j = " + j);
		
		i = 3;
		j = 4;
		System.out.println("\nPod c)\ni = " + i + ", j = " + j);
		j = 3 + ++i;
		System.out.println("i = " + i + ", j = " + j);
		
		i = 3;
		j = 4;
		System.out.println("\nPod d)\ni = " + i + ", j = " + j);
		j = 3 + i++;
		System.out.println("i = " + i + ", j = " + j);
	}

}
