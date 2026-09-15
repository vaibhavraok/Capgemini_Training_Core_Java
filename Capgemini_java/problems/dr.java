package problems;

class dr {
	public static void main(String [] args) {
		int [] arr= {1,1,3};
		int num=0;
		for(int i=0;i<arr.length;i++) {
			num=num*10+arr[i];
		}
		num++;
		int i=arr.length-1;
		int [] temp=new int [arr.length];
		if(arr[i]==9) {
			temp=new int[arr.length-1];
		}
		
		while(num>0) {
			int ele =num%10;
			temp[i]=ele;
			
		}
	}
}
