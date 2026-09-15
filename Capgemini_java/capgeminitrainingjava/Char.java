package capgeminitrainingjava;
import java.util.*;
public class Char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		System.out.println(words(a));
//		fourd(a);
	}
	public static void Char() {
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		System.out.println("Length of String: "+a.length());
		for(int i=0;i<a.length();i++) {
			System.out.println(a.charAt(i));
		}
	}
	public static int number(String a) {
		int b=0;
		System.out.println(a.getClass().getSimpleName());
		for(int i=0;i<a.length();i++) {
//			if(a.charAt(i)>=0 || a.charAt(i)<=9) {
//				while()
//			}
			b=(b*10)+a.charAt(i)-'0';
		}
		
		return b;
		
	}
	public static String Stringa(int a) {
		String result="";
		 while (a > 0) {
		        int digit = a % 10;         
		        char c = (char) (digit + '0'); 
		        result = c + result;         
		        a=a / 10;                  
		    }
		 System.out.println(result.getClass().getSimpleName());
		return result;
	}
	public static void pal(String a) {
		String res="";
		for(int i=a.length()-1;i>=0;i--) {
			res+=a.charAt(i);
		}
		System.out.println(res);
		if(res==a) {
			System.out.println("Its palindrome");
		}
		else {
			System.out.println("Its not a palindrome");
		}
	}
	public static String fourd(String a) {
		String f="";
		int count=0;
		int c=a.length()-4;
		for(int i=0;i<a.length();i++) {
			count++;
			if(count>c){
				f+=a.charAt(i);
			}
			else {
				f+='x';
			}
		}
		return f;
	}
	public static String upper(String a) {
		String s="";
		for(int i=0;i<a.length();i++) {
			if(a.charAt(i)>='A' && a.charAt(i)<='Z' ) {
				s+=(char)(a.charAt(i)+' ');
			}
			else{
				s+=a.charAt(i);
		}
		
		
	}
		return s;
	}
	public static String lower(String a) {
		String s="";
		for(int i=0;i<a.length();i++) {
			if(a.charAt(i)>='a' && a.charAt(i)<='z' ) {
				s+=(char)(a.charAt(i)-' ');
			}
			else{
				s+=a.charAt(i);
		}
	}
		return s;
	}
	public static int words(String a) {
		int count=1;
		for(int i=0;i<a.length();i++) {
			if(a.charAt(i)==' ') {
				count++;
			}
		}
		return count;
	}
}
