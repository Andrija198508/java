package zadatak377;

public class Kvadrat extends GeometrijskaFigura{
		double stranica;
		
		Kvadrat(double stranica){
			if(stranica > 0.0)
				this.stranica = stranica;
			else
				System.out.println("Greška: stranica mora biti veća od nule!");
		}
		
		public double izracunajPovrsinu() {
			return stranica * stranica;
		}
		
		public double izracunajObim() {
			return 4 * stranica;
		}
}
