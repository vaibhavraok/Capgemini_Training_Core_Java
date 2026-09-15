package constructor;
// Composition (another class <--- Dependent class)
class Battery{
	int capacity;
	String colour;
	Battery(int capacity,String colour){
		this.capacity=capacity;
		this.colour=colour;
	}
	public void batteryDetails() {
		System.out.println("Capacity is : "+capacity);
		System.out.println("Colour is : "+colour);
	}
}
class Mobile{
	String mColour;
	int price;
	Battery b;// create a dependent variable of the dependent class
	Mobile(String mColour, int price, Battery b){
		this.mColour=mColour;
		this.price=price;
		this.b=b;
	}
	public void mobileDetails() {
		System.out.println("Mobile colour is : "+mColour);
		System.out.println("Price is : "+price);
	}
}
public class Driver2 {
	public static void main(String [] args) {
		Mobile m=new Mobile("Black",25000,new Battery(2000,"Black"));
		m.mobileDetails();
		m.b.batteryDetails(); // m stores the address of b which is the battery
	}
}
