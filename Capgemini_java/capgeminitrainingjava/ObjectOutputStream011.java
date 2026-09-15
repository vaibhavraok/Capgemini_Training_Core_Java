package capgeminitrainingjava;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Studenttt implements Serializable
{
	int id;
	String name;
	public Studenttt(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}


class Student50{
	int id=13;
	static Object obj;
	
	@Override
	public void finalize() {
		obj=this;
	}
}

public class finalize01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student50 s=new Student50();
		System.out.println(s);
		System.out.println(s.id);
		
		s=null;
		System.gc();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Student50.obj);
		
		Student50 s1=(Student50)Student50.obj;
		
		System.out.println(s1.id);
	}

}

}

public class ObjectOutputStream011 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		try {
//			Studenttt s=new Studenttt(01, "ninthin");
//		ObjectOutputStream obj=new ObjectOutputStream(new FileOutputStream("C:\\Users\\Hp\\Desktop\\JAVACLASS\\texte.txt"));
//		obj.writeObject(s);
//		System.out.println("Object stored");
//		}catch (Exception e) {
//			e.printStackTrace();
//		}
		
		try {
		ObjectInputStream obj=new ObjectInputStream(new FileInputStream("C:\\Users\\Hp\\Desktop\\JAVACLASS\\texte.txt"));
		Studenttt s=(Studenttt)obj.readObject();
		
		System.out.println(s.id);
		System.out.println(s.name);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}



//import java.io.FileInputStream;
//import java.io.FileOutputStream;
//import java.io.ObjectInput;
//import java.io.ObjectInputStream;
//import java.io.ObjectOutput;
//import java.io.ObjectOutputStream;
//import java.io.Serializable;
//
//class Studenttt implements Serializable
//{
//	int id;
//	String name;
//	public Studenttt(int id, String name) {
//		super();
//		this.id = id;
//		this.name = name;
//	}
//	
//}
//
//public class ObjectOutputStream011 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
////		try {
////			Studenttt s=new Studenttt(01, "ninthin");
////		ObjectOutputStream obj=new ObjectOutputStream(new FileOutputStream("C:\\Users\\Hp\\Desktop\\JAVACLASS\\texte.txt"));
////		obj.writeObject(s);
////		System.out.println("Object stored");
////		}catch (Exception e) {
////			e.printStackTrace();
////		}
//		
//		try {
//		ObjectInputStream obj=new ObjectInputStream(new FileInputStream("D:\\Capgemini Training Period\\Java\\notes\\example1.txt"));
//		Studenttt s=(Studenttt)obj.readObject();
//		
//		System.out.println(s.id);
//		System.out.println(s.name);
//		}catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
//
//}
//
//
