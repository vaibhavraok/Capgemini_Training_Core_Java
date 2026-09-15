package capgeminitrainingjava;
// object calss is inbuilt class and  is the parent of all the class and now we are overriding the methods of object class to our convinient
class Student extends Object{
	int age;
	String name;
	Student(int age,String name){
		this.age=age;
		this.name=name;
	}
//	@Override
//	public String toString() {
//		return "Age: "+ age+" Name : "+name;
//	}
//	@Override
//	public boolean equals(Object o) {
//		Student s2=(Student) o;
//		return this.age==s2.age && this.name.equals(s2);// checks the value and "AND" operator is the final decision
//	}
//	@Override
//	public int hashCode() {
//		return name.hashCode()+age;
//	}
}


class objectclassrefern {
	public static void main(String [] args) {
		Student s= new Student(22,"Vaibhav");
		Student s1= new Student(22,"Vaibhav");
		String a="a";
		String b="a";
		System.out.println(s);
		System.out.println(a==b);
		System.out.println(s==s1);//checks the value are equal or not
		System.out.println(a.equals(b)); //equals is used only for the string (or non primitive type) to check the value
		System.out.println();
		System.out.println(s.equals(s1));// it is checking the address which is different for each object
		System.out.println(s.hashCode());//1892925199
		System.out.println(s1.hashCode());//1892925199
		System.out.println(s.hashCode()==s1.hashCode());//true
	}
}
