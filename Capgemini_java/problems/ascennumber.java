package problems;
import java.util.*;

public class ascennumber {
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int a = sc.nextInt();
        int res = 0;
        for (int i = 0; i <= 9; i++) {
            int temp = a;
            while (temp > 0) {
                int lastDigit = temp % 10;
                if (lastDigit == i) {
                    res = (res * 10) + i;
                }
                temp = temp / 10; 
            }
        }
        System.out.println("Digits in ascending order: " + res);
        sc.close();
    }
}














//package problems;
//import java.util.*;
//public class ascennumber {
//	public static void main(String []args)
//	{
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the number");//123
//		int a=sc.nextInt();
//		int i=a;
//		int j;//last
//		int x;//last-1
//		String res="";
//		while(i!=0) {
//			i=i%10;
//			j=i;
//			i=i%100;
//			x=i;
//			if(j<x) {
//				res=res+x;
//				res=res+j;
//			}
//		}
//		System.out.println(res);
//	}
//}
