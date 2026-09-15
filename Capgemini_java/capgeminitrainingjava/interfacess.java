package capgeminitrainingjava;

interface Demo11{
	abstract public int display1(int a,int b);
	// we can have static and non static methods here
}


class Interfacess {
	public static void main(String [] args) {
		// lambda expression
		Demo11 d=(a,b) -> {  // here -> is an lambda expression for function interface which has single/ 1 abstract method
			System.out.println("Hello");
			System.out.println("Hi");
			return a+b;			
		};
		System.out.println(d.display1(10,20));
	}
}
