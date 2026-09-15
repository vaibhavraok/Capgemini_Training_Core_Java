package capgeminitrainingjava;
import java.util.ArrayList;
class stream {
	public static void main(String [] args) {
	ArrayList<Integer> a=new ArrayList<Integer>();
	a.add(10);
	a.add(20);
	a.add(5);
	a.add(23);
	a.stream().filter(x-> x%2==0).forEach(x-> System.out.println(x));
	System.out.println("---------------");
	a.stream().map(x-> x*2).forEach(x -> System.out.println(x));
	System.out.println("---------------");
	a.stream().sorted().forEach(x -> System.out.println(x));
}
}
