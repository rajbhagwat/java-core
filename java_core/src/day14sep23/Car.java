package day14sep23;

public class Car {
	// instance variables/non static variables
	int price;
	float weight;
	String brand;
	String color;
	boolean isElectric;
	
	//methods
	void start()
	{
		System.out.println("Starting a car.....");
	}
	void stop()
	{
		System.out.println("stopping a car....");
	}
	void accelerate()
	{
		System.out.println("Accelerating a car...");
	}
	public static void main(String[] args) {
		Car c1 = new Car();
		c1.start();
		c1.accelerate();
		c1.stop();
		System.out.println("**********************************************");
		  /*
        where Car: class name
              c1: reference variable
              new: operator/keyword
              Car(); constructor (special type of method)
              new Car(): object which occupies memory
       */
		
		Car c2 = new Car();
		System.out.println("c1.price      : " + c1.price);
		System.out.println("c1.weight     : " + c1.weight);
		System.out.println("c1.brand      : " + c1.brand);
		System.out.println("c1.color      : " + c1.color);
		System.out.println("c1.isElectric : " + c1.isElectric);
		
		System.out.println("------------------------------------------");
		
		System.out.println("c2.price      : " + c2.price);
		System.out.println("c2.weight     : " + c2.weight);
		System.out.println("c2.brand      : " + c2.brand);
		System.out.println("c2.color      : " + c2.color);
		System.out.println("c2.isElectric : " + c2.isElectric);
		
		
		System.out.println("------------------C1------------------");
		c1.price      = 10000;
		c1.weight     = 1200.500f;
		c1.brand      = "Maruti";
		c1.color      = "Black";
		c1.isElectric = false;
		
		System.out.println("c1.price      : " + c1.price);
		System.out.println("c1.weight     : " + c1.weight);
		System.out.println("c1.brand      : " + c1.brand);
		System.out.println("c1.color      : " + c1.color);
		System.out.println("c1.isElectric : " + c1.isElectric);
		
		System.out.println("---------------C2-----------------------");
		c2.price      = 20000;
		c2.weight     = 2300.400f;
		c2.brand      = "Tata";
		c2.color      = "White";
		c2.isElectric = true;
		
		System.out.println("c2.price      : " + c2.price);
		System.out.println("c2.weight     : " + c2.weight);
		System.out.println("c2.brand      : " + c2.brand);
		System.out.println("c2.color      : " + c2.color);
		System.out.println("c2.isElectric : " + c2.isElectric);
		
		c2.start();
		c2.accelerate();
		c2.stop();
		
	}

}
