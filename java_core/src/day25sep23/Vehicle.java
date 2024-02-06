package day25sep23;

public class Vehicle {
	
	String vNo;
	int    capacity;
	String brand;
	Engine e;
	
	public Vehicle(String vNo, int capacity, String brand, Engine e)
	{
		this.vNo      = vNo;
		this.capacity = capacity;
		this.brand    = brand;
		this.e        = e;
		
	}
	@Override
	public String toString() {
		return vNo + " : " + capacity + " : " + brand + " : " + e.toString();
	}
}
