package capgeminitrainingjava;

interface Demo1{
	abstract public void display1();
	// we can have static and non static methods here
}

class ChildClass1 implements Demo1{
	@Override
	public void display1()
	{
		System.out.println("Hello");
	}
}
class Interfaces1 {
	public static void main(String [] args) {
		Demo1 d=new ChildClass1();
		d.display1();
		
	}
}
