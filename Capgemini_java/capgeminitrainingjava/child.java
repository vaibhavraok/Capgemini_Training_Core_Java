package capgeminitrainingjava;

interface a{
	int A=20;
	abstract public void display();
}
interface b{
	int B=30;
	abstract public void display();
}
class child implements a,b
{
	public void display()
	{
		System.out.println("Hello");
	}
	public static void main(String [] args) {
		child c=new child();
		System.out.println(c.A);
		System.out.println(c.B);
		c.display();
		
		a x=new child();
		x.display();
	}
}