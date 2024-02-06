package day27sep23;

public class Vehicle {
	// instance variables or non static variables
	String vNo;
	String brand;
	int    price;
	
	// non static methods
	void start()
	{
		System.out.println("Starting  vehicle..... ");
		
	}
	void stop()
	{
		System.out.println("Stopping a vehicle....");
	}
	Vehicle() {
		System.out.println(" I am in vehicle constructor");
	}
	Vehicle(String brand)
	{
		System.out.println("I am in 1 arg(price) vehicle constructor");
	}
	Vehicle(int price)
	{
		System.out.println("I am in 1 arg(price) vehicle constructor");
	}
}
