package problems;
import java.util.*;
class arraysort {
	public static void main(String[] args) {
	
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the size of a array");
	int size=sc.nextInt();
	int [] arr=new int[size];
	System.out.println("Enter the array elements");
	for(int i=0;i<arr.length;i++) {
		arr[i]=sc.nextInt();
	}
	System.out.println("Enter array is");
//	for(int ele:arr) {
//		System.out.print(ele+" ");
//	}
//	
//	System.out.println();
	System.out.println(Arrays.toString(arr));
	int temp;
	for(int i=0;i<arr.length-1;i++) {
		if(arr[i]>=arr[i+1]) {
			temp=arr[i];
			arr[i]=arr[i+1];
			arr[i+1]=temp;
		}
	}
	System.out.println("Sorted array is");
//	for(int ele:arr) {
//		System.out.print(ele+" ");
//	}
	System.out.println(Arrays.toString(arr));
	}
}
