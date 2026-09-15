package constructor;

class Studentclass {
	String sname;
	int sid;
	String usn;
	
	Studentclass(String sname,int sid,String usn){
		this.sname=sname;
		this.sid=sid;
		this.usn=usn;
	}
	public void studentDetails() {
		System.out.println("Sname is: "+sname);
		System.out.println("Sid is : "+sid);
		System.out.println("usn is : "+usn);
	}
}

class Tutorial{
	String name;
	String location;
	String teacherName;
	Studentclass s;
	
	Tutorial(String name,String location,String teacherName){
		this.name=name;
		this.location=location;
		this.teacherName=teacherName;
	}
	
	public void TutorialDetails() {
		System.out.println("name is: "+name);
		System.out.println("Location is : "+location);
		System.out.println("TeacherName is : "+teacherName);
	}
	public void addStudent(String sname,int sid,String usn) {
		s=new Studentclass(name,sid,usn);
	}
	public void removeStudent() {
		s=null;
	}
}

class Driver5{
	public static void main(String[] args) {
		Tutorial t=new Tutorial("Vaibhav","Bangalore","Rajiv");
		t.TutorialDetails();
		t.addStudent("Vaibhav",123,"3BR22AI179");
		t.s.studentDetails();
		t.removeStudent();
		t.s.studentDetails();
	}
}