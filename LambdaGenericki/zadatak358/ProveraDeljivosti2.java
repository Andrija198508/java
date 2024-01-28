package zadatak358;

public class ProveraDeljivosti2 {

	public static void main(String[] args) {
		ProveraDeljivosti pd = (n, d) -> (n % d) == 0;
		
		if(pd.test(10, 2)) {
			System.out.println("N je deljivo sa D");
		}else {
			System.out.println("N nije deljivo sa D");
		}
	}

}
