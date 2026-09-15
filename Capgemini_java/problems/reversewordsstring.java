package problems;
import java.util.*;
class reversewordsstring {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();//hi this is java
		String [] a=new String[s.length()];
		a=s.split(" ");
//		for(String ele:a) {
//			System.out.print(ele);
//		}
		for(int i=a.length-1;i>=0;i--) {
			System.out.print(a[i]+" ");
		}
}
}