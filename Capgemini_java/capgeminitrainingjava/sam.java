package capgeminitrainingjava;

class sam {
	int a;
	double d=13.5;
	static {
		System.out.println("This is static method");
	}
	{
		System.out.println("In block 1");
	}
	{
		System.out.println("In block 2");
	}
	public void m1() {
		System.out.println("In m1");
	}
	public void m2() {
		System.out.println("In m2");
	}
	public static void main(String [] args) {
		System.out.println("Start");
		sam d=new sam();
		System.out.println(d.a);
		sam d2= new sam();
		System.out.println(d2.a);
		System.out.println(d.d);
	}

}
