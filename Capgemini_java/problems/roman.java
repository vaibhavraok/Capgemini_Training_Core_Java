package problems;
import java.util.*;
class value{
	public int val(String ch) {
		int [] a= new int[ch.length()];
		int b=0;
		for(int i=0;i<ch.length();i++) {
			switch(ch.charAt(i)) {
			case 'I':
				a[i]=1;
				break;
			case 'V':
				a[i]= 5;//5+1=6,6+1=7
				break;
			case 'X':
				a[i]= 10;
				break;
			case 'L':
				a[i]= 50;
				break;
			case 'C':
				a[i]= 100;
				break;
			case 'D':
				a[i]= 500;
				break;
			case 'M':
				a[i]= 1000;
//			default:
//				System.out.println("Invalid Roman number "+ ch.charAt(i));
			}
	}
		for(int i=0;i<a.length-1;i++) {
			if(a[i]<a[i+1]) {
				b=a[i+1]-a[i];
			}
			else if(a[i]>a[i+1]) {
				b=a[i]+a[i+1];
			}
		}
		return b;
}
}
public class roman {
	public static void main(String [] args) {
		String ch="";
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Roman number");
//		ch=sc.next();
		value v=new value();
		System.out.println(v.val(sc.next()));
		
	}
}
