package constructor;

class student1
{
	int a;
	public student1 m1(){
		System.out.println("In m1");
		System.out.println(a);
		return this;
	}
	public student1 m2() {
		System.out.println("In m2");
		return this;
	}
	public void m3() {
		System.out.println("In m3");
	}
}
class demo2 {
	public static void main(String [] args) {
		student1 s=new student1();
		s.m1().m2().m3();
	}
}
