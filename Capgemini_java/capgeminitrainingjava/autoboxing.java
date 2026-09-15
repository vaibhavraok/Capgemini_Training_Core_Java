package capgeminitrainingjava;

class autoboxing {
	public static void main(String [] args)
	{
	//Auto boxing
	int a=10;
	Integer i=a;
	
	//Auto Unboxing
	Integer i1=20;
	int a1=i1;
	
	//Explicit Boxing
	int num=30;
	Integer i2=Integer.valueOf(num);
	
	//Explicit Unboxing
	Integer i3 =new Integer(40);
	int a2=i3.intValue();
	
	System.out.println(i);
	System.out.println(a1);
	System.out.println(i2);
	System.out.println(a2);
	}
}
