package capgeminitrainingjava;

class Car {
	String color;
	String Brand;
	String model;
	double price;
	int cc;
	
	public void parking() {
		System.out.println("Parking");
	}
	public void race() {
		System.out.println("Racing");
	}
	public void travel() {
		System.out.println("Travelling");
	}


public static void main(String [] args) {
	
	Car c = new Car();
	c.color="White";
	System.out.println(c.color);
}}

