package problems;
//Arrays.tostring(arr)--import java.util.Arrays;
import java.util.*;
class arrsum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter array");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		int a[]=new int[size+1];
		String sum="";
		//String s="";
		int x=(arr[arr.length-1]%10);
		int digit=x+1;
		for(int i=0;i<arr.length;i++) {
			
			a[i]+=arr[i];
			if(i==arr.length-2) {
				sum+=(arr[i]+1);
			}
			else {
				sum+=arr[i];
			}
			//s+=arr[i];
		}
		//s=s+digit;
		a[a.length-2]+=1;
		if(a[size]==9) {
			int y;
			y=(a[size+1])%10;//modulus
			int z=(a[size+1])/10;
			int zz=z%10;
			a[size+1]=y;
			a[size]=a[size]+zz;
			
		}
		System.out.println(sum);
		//System.out.println(s);
		
		System.out.println(Arrays.toString(a));
	}
}
