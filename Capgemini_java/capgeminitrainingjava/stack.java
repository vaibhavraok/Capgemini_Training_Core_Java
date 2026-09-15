package capgeminitrainingjava;
import java.util.Stack;
class stack {
	public static void main(String [] args) {
		Stack<Integer> s=new Stack();
		s.add(10);
		s.push(20);
		s.push(null);
		s.pop();
		System.out.println(s.peek());
		System.out.println(s);
		System.out.println(s.search(20));
	}
}
