package constructor;
class CarFactory{
	public static Car1 buildCar(String brand, double price) {
		return new Car1(brand,price);
	}
}
class Car1{
	String brand;
	double price;
	Car1(String brand, double price){
		this.brand=brand;
		this.price=price;
	}
}
class Driver1{
	public static void main(String[] args) {
		Car1 c=CarFactory.buildCar("Aulto",1000);
		Car1 c1=CarFactory.buildCar("Fortuner", 5000);
		System.out.println(c.brand);
		System.out.println(c.price);
		System.out.println(c1.brand);
		System.out.println(c1.price);
	}
}

