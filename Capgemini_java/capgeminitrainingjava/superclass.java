package capgeminitrainingjava;
class father1 { 
    String fname; 
    int fage; 
    
    father1(String fname, int fage){ 
        this.fname = fname; 
        this.fage = fage; 
    } 
    
    public void father1Details() { 
        System.out.println("Father name: " + fname); 
        System.out.println("Father age: " + fage); 
    } 
} 

class son1 extends father1 { 
    String sname; 
    int sage; 
    
    son1(String sname, int sage, String fname, int fage) { 
        super(fname, fage); 
        this.sname = sname; 
        this.sage = sage; 
    } 
    
    public void son1Details() { 
        System.out.println("Son name: " + sname); 
        System.out.println("Son age: " + sage); 
    } 
} 

class superclass { 
    public static void main(String[] args) { 
        son1 s = new son1("Rahul", 23, "Ramesh", 50); 
        s.father1Details(); 
        s.son1Details(); 
    } 
}


























//
//class father1 {
//	String fname;
//	int fage;
//	father1(String fname,int fage){
//		this.fname=fname;
//		this.fage=fage;
//	}
//	public void father1Details(String fname,int fage) {
//		System.out.println("Father name: "+fname);
//		System.out.println("Father age: "+fage);
//	}
//}
//class son1 extends father1{
//	String sname;
//	int sage;
//	son1(String sname,int sage,String fname,int fage){
//		super(fname,fage);
//		this.sname=sname;
//		this.sage=sage;
//	}
//	public void son1Details() {
//		System.out.println("Son name: "+sname);
//		System.out.println("Son age: "+sage);
//	}
//}
//class superclass {
//	public static void main(String [] args) {
//		son1 s = new son1("Rahul", 23, "Ramesh", 50); 
//        s.father1Details(); 
//        s.son1Details(); 
////		s.sonDetails();
////		s.fatherDetails();
////		father f=new father();
////		f.father1Details();
//		//s.father1Details(); 
//		//s.son1Details();
//		//f.father1Details();
//	}
//}