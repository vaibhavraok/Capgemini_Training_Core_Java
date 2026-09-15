package capgeminitrainingjava;

import java.util.ArrayList;

class arrayli {
	 public static void main(String [] args) {
		 ArrayList<String> a= new ArrayList();
		 a.add("Nithin");
		 a.add("Kavya");
		 a.add("Shashank");
		 ArrayList<String> a1=new ArrayList();
		 a1.add("Nithin");
		 System.out.println(a.contains("Nithin"));
		 System.out.println(a.containsAll(a1));
		 System.out.println(a.indexOf("Nithin"));
		 System.out.println(a.lastIndexOf("Nithin"));
	 }
}
