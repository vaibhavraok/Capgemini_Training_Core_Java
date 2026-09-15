package capgeminitrainingjava;

interface Demo2{
	abstract public void display();
	// we can have static and non static methods here
}

//class ChildClass implements Demo{
//	@Override
//	public void display()
//	{
//		System.out.println("Hello");
//	}
//}
class Interfaces {
	public static void main(String [] args) {
//		Demo d=new ChildClass();
//		d.display();
		Demo2 d=new Demo2(){
			@Override
			public void display() {
				System.out.println("Hello");
			}
		}; // this semicolon is a anonymous class
		d.display();
	}
}
