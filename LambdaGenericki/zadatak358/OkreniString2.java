package zadatak358;

public class OkreniString2 {

	public static void main(String[] args) {
		OkreniString os = (str) -> {
			String rezultat = "";
			for(int i = str.length() -  1; i >= 0; i--) {
				System.out.print(str.charAt(i));
			}
			return rezultat;
		};
		
		System.out.print("12345: ");
		System.out.println(os.okreni("12345"));
	}

}
