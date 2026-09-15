package capgeminitrainingjava;
// parent child using extends keyword
class father {
	String fname="Bahubali";
	int fage=50;
	
	public void  fatherDetails() {
		System.out.println("Father name: "+fname);
		System.out.println("Father age: "+fage);
	}
}
class son extends father{
	String sname="Shivudu";
	int sage=23;
	public void sonDetails() {
		System.out.println("Son name: "+sname);
		System.out.println("Son age: "+sage);
	}
}
class drive{
	public static void main(String [] args) {
		son s=new son();
		s.sonDetails();
		s.fatherDetails();
		father f=new father();
		f.fatherDetails();
	}
}