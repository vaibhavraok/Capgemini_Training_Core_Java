package constructor;
//constructor
class Student{
	int id;
	String name;
	String dept;
	
	Student(int a,String b,String c){
		this.id=a;
		this.name=b;
		this.dept=c;
		//this(id,name);
		//this.dept=dept; // chaining
	}
	public Student m1() {
		System.out.println("In m1");
		return this;
		//Student(int a,String b){
		//this(id);
		//this.name=name; }
		//Student(int a){
		//this.id=id;  }
	}
	public Student m2() {
		System.out.println("In m2");
		return this;
	}
	public Student m3() {
		System.out.println("In m3");
		return this;
	}
}
public class demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Student s= new Student(3,"chintu","AIML");
		Student s= new Student(3,"chintu","AIML");
		System.out.println(s.name);
		System.out.println(s.id);
		s.m1().m2().m3();
	}

}
