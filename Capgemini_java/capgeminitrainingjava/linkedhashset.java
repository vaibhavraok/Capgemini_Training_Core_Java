package capgeminitrainingjava;
import java.util.LinkedHashSet;

public class linkedhashset {
	public static void main(String[] args) {
		LinkedHashSet<Integer> l = new LinkedHashSet<Integer>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(null);
		l.add(10);
		l.add(null);
		System.out.println(l);
	}

}
