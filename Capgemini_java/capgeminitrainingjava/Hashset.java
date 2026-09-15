package capgeminitrainingjava;
import java.util.HashSet;
class Hashset {
	public static void main(String [] args) {
		HashSet<Integer> h =new HashSet();
		h.add(10);
		h.add(20);
		h.add(10);
		h.add(null);
		h.add(null);

		System.out.println(h);// duplicates not allowed and insertion order is not followed but LIFO
	}
}
