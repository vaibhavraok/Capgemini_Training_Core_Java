package capgeminitrainingjava;

import java.util.ArrayList;

class Drive14 {
	public static void main(String [] args) {
		ArrayList<String> a = new ArrayList();
		a.add("Nithin");
		a.add("Kavya");
//		System.out.println(a);
		ArrayList<String> a1 =new ArrayList<String>();
		a1.add("Nithin");
		//a.removeAll(a1);
		System.out.println(a1);
		a.retainAll(a1);
		System.out.println(a);
	}
}
