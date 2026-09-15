package capgeminitrainingjava;

class aa{
	int A=10;
	private int B=100;
	public void display() {   // we cannot access private members directly but using a getter or setter (using a method)
		System.out.println(B);
	}
	public void display1() {
		System.out.println(A);
	}
}
class bb{
	int C=30;
	public void display2() {
		System.out.println(C);
	}
}
class D {
	public static void main(String [] args) {
		aa d=new aa();
//		System.out.println(d.B);    //Unresolved compilation problem: The field aa.B is not visible
		d.display();
	}
}
