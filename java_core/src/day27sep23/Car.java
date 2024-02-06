package day27sep23;

public class Car extends Vehicle {
	String Owner;
	int    noOftyres;
	boolean isElectric;
	
	Car()
	{
 		super(1234);
		//super("Maruti"); //super() should be the first call in a constructor
		System.out.println(" I am in Car constructor");
	}
	//non static methods
	void showDetails()
	{
		System.out.println("Showing a Car details");
	}
	void applyBreakes()
	{
		System.out.println("appling brakes");
	}
}
