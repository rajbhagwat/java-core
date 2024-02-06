package day21sep23;

public class Car {
	//instance variables/non static variables
	String  name;
	int     price;
	float   weight;
	boolean isElectric;
	char    brand;
	
	void disp()
	{
		System.out.println(name + " : " + price  + " : " + weight + " : " + isElectric + " : " + brand );
	}
		// constructor - zero parameterised
		Car()
		{
			System.out.println(" I am in a Car contructor...");
			
		}
		
		// constructor overloading
		Car(String name, int price, float weight, boolean isElectric, char brand)
		{
			System.out.println("I am in 5 parameterised Car contructor starts with name");
			//IV              = parameter;
			this.name       = name;
		    this.price      = price;
			this.weight     = weight;
			this.isElectric = isElectric;
			this.brand      = brand;
		}
		Car(int price, float weight, boolean isElectric, char brand, String name)
		{
			System.out.println("I am in 5 parameterised Car contructor starts with price");
		
		
			//IV              = parameter;
			this.name       = name;
		    this.price      = price;
			this.weight     = weight;
			this.isElectric = isElectric;
			this.brand      = brand;
		
	}

	public static void main(String[] args) {
		Car c1 = new Car();
		c1.disp();
		Car c2 = new Car("Audy", 2000,1230.0f,false,'M');
		c2.disp();
		
		Car c3 = new Car(5000,5000.0f,true,'S',"Ferari");
		c3.disp();

	}

}
