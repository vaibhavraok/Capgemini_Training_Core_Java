package problems;
import java.util.*;
class reverselettersentence {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String a[]=new String[s.length()];
		a=s.split(" ");
		String x="";
		//System.out.println(Arrays.toString(a));
		//System.out.println(a[0]);
		for(int i=0;i<a.length;i++) {
			x=a[i];
			for(int j=x.length()-1;j>=0;j--) {
			System.out.print(x.charAt(j));
		}
			System.out.print(" ");
		}
	}
}
/*
this is
[this, is]
siht si  //output
*/