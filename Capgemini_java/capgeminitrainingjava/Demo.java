package capgeminitrainingjava;

class Demo {
	public static void m3() {
		System.out.println("In m3");
	}
}
class StaticMethods{
	public static void m1() {
		System.out.println("In m1");
	}
	public static void m2() {
		System.out.println("In m2");
	}
	public static void main (String [] args) {
		StaticMethods.m1();
		m1();
		m2();
		Demo.m3();
	}
}
