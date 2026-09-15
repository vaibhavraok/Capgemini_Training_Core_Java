package capgeminitrainingjava;

class products {
	public void payment()
	{
		System.out.println("500");
	}
}
class clothes extends products{
	public void buyclothes() {
		System.out.println("Buying clothes");
	}
}
class shoes extends products{
	public void display() {
		System.out.println("Buying shoes");
	}
	@Override
	public void payment() {
		System.out.println("300");
	}
	public static void main(String [] args) {
		products p=new shoes();
		products p1=new clothes();
		p1.payment();
		p.payment();
	}
}
