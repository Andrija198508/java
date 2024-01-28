package zadatak358;

public class GenerickiTip2<T, V> {
		T obj1;
		V obj2;
		
		GenerickiTip2(T o1, V o2){
			obj1 = o1;
			obj2 = o2;
		}
		
		public T getObj1() {
			return obj1;
		}
		public V getObj2() {
			return obj2;
		}
		
		public void setObj1(T obj1) {
			this.obj1 = obj1;
		}
		public void setObj2(V obj2) {
			this.obj2 = obj2;
		}
		
		public void prikaziTip() {
			System.out.println("T: " + obj1.getClass().getName());
			System.out.println("V: " + obj2.getClass().getName());
		}
}
