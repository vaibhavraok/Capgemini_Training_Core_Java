package capgeminitrainingjava;

class Outer{
	static class inner{
		static int a=10;
	}
}
class Driverr {
	public static void main(String[] args) {
		System.err.println(Outer.inner.a);// static variable in static inner class
	}
}
