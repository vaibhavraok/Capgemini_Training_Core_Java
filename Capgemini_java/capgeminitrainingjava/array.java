package capgeminitrainingjava;
import java.util.*;
public class array {
	public static void main(String [] args) {
//		Scanner sc =new Scanner(System.in);
//		System.out.println("Enter the array size");
//		int [] arr =new int[sc.nextInt()];
//		System.out.println("Enter the array elements:");
//		for(int i=0;i<arr.length;i++) {
//			arr[i]=sc.nextInt();
//		}
//		for(int ele:arr) {
//			System.out.println(ele);
//		}
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the array size");
		int arr[][] =new int[sc.nextInt()][sc.nextInt()];
		System.out.println("Enter the array elements:");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
			arr[i][j]=sc.nextInt();
		}
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
			System.out.print(arr[i][j]+' ');
		}
			System.out.println();
		}
	}
}
