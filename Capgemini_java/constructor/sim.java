package constructor;

class sim {
	int simNo;
	String simColour;
	
	sim(int simNo,String simColour){
		this.simNo=simNo;
		this.simColour=simColour;
	}
	public void simDetails() {
		System.out.println("SimNo is : "+simNo);
		System.out.println("SimColour is : "+simColour);
	}
}
class Mobile1{
	String mColour;
	int mprice;
	sim s;
	Mobile1(String mColour,int mprice){
		this.mColour=mColour;
		this.mprice=mprice;
	}
	public void mobileDetails1() {
		System.out.println("mColour is: "+mColour);
		System.out.println("mprice is : "+mprice);
	}
	public void insertsim(int simNo,String simColour) {
		s =new sim(simNo,simColour);
	}
	public void removeSim()
	{
		s=null;
	}
}

class Driver4
{
	public static void main(String[] args) {
		Mobile1 m=new Mobile1("Lavender",3000);
		m.mobileDetails1();
		m.insertsim(2000, "Black");
		m.s.simDetails();
		
		m.removeSim();
		m.s.simDetails();
	}
}