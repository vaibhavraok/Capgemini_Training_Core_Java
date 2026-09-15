package capgeminitrainingjava;

class test1{
	static int t=20;
	static {
		System.out.println("In block Random");
	}
}
class Sample {
	static int a=100;
	static double d=13.23;
	static {
		System.out.println("In block 1");
	}
	static {
		System.out.println("In block 2");
	}
	public static void main(String [] args) {
		System.out.println("In main method");
		System.out.println(a);
		System.out.println(d);
		System.out.println(test1.t);
	}
	static {
		System.out.println("In block 3");
	}
}
