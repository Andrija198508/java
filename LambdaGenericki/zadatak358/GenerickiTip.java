package zadatak358;

public class GenerickiTip<T> {
		T ob;
		
		GenerickiTip(T o){
			ob = o;
		}
		
		public void setOb(T ob) {
			this.ob = ob;
		}
		
		public T getOb() {
			return ob;
		}
		
		void prikaziTip() {
			System.out.println("Tip T je: " + ob.getClass().getName());
		}
}
