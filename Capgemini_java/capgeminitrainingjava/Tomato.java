package capgeminitrainingjava;
//generalization
class veges{
	int calories=2;
	int fiber=2;
}
class Tomato extends veges{
	String colour="Red";
	int price=25;
}
class potato extends veges{
	int quality=1;
	String shape="Oval";
}
class Driver6{
	public static void main(String[] args) {
//		potato p=new potato();
//		System.out.println(p.quality);
//		System.out.println(p.shape);
//		
//		Tomato t=new Tomato();
//		System.out.println(t.colour);
//		System.out.println(t.price);
		veges v1=new potato();//(upcasting)
		veges v2 =new Tomato();
		
	/*	System.out.println(v1.calories);
		//System.out.println(v1.quality);
		System.out.println(v2.fiber);// this is upcasting where child can access parent members only ont the child ones.. (generalization)
		*/
		potato p=(potato)v1;// typecast back to the child to access child (down-casting)
		System.out.println(p.calories);
		System.out.println(p.fiber);
		System.out.println(p.shape);
		System.out.println(p.quality);
		
		Tomato t=(Tomato) v2;
		System.out.println(t.price);
		System.out.println(t.colour);
		System.out.println(t.fiber);
		System.out.println(v2 instanceof Tomato);
	}
}