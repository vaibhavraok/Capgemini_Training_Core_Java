package capgeminitrainingjava;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Collections;

class linkcolle {
	public static void main(String [] args) {
		LinkedList<String> l=new LinkedList<String>();
		ArrayList<Integer> a =new ArrayList();
		a.add(12);
		a.add(13);
		a.add(23);
		a.add(44);
		System.out.println(a);
		Collections.sort(a);
		Collections.reverse(a);
		System.out.println(a);
	}
}
