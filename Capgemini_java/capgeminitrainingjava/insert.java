package capgeminitrainingjava;

import java.util.Scanner;

class insert {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
    int[] arr = new int[4]; 
    System.out.println("Enter 4 arr int numbers");
    for(int i = 0; i < arr.length; i++) {
        arr[i] = sc.nextInt();
    }
    System.out.println("Enter the postion");
    int index=sc.nextInt();
    System.out.println("Enter the element");
    int ele=sc.nextInt();
	int [] b=new int [arr.length+1];
	int j=0;
	for(int i=0;i<arr.length;i++) {
		b[j]=arr[i];
		if(j==index) {
			b[j]=ele;
			j++;
			b[j]=arr[i];
		}
		j++;
	}
	for(int e:b) {
		System.out.println(e);
	}
	}
}
