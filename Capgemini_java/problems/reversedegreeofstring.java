package problems;
import java.util.*;
public class reversedegreeofstring {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter letters");
		String a="";
		a=sc.next();
		int c;
		int n;
		//int d;
		//int count=0;
		int sum=0;
		for(int i=0;i<a.length();i++) {
			n=a.charAt(i);
			if(n>=97 && n<=122) {
				c=123-n;
			}
			else {
				c=91-n;
			}
			/*if(n>=97 && n<=122) {
				count++;
			}
			*/
			sum=sum+c*(i+1);
		}
		System.out.println(sum);
	}
	/*
	 reverse degree of a string
	 a-> 26x1=26
	 b   25x2=50
	 c   24x2=72
		 sum=148
	 */
	
}
