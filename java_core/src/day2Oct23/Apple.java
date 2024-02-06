package day2Oct23;

public class Apple extends Fruits {
	
	String shape;
	String color;
	@Override            // Annotation - instruction to dev and compiler 
	void makeaJuice()  // this method is called Overridden method 
	{
		System.out.println("Making a juice using Apple only");
//		return new Apple();
//		return new int[] {1,2,3};
//	    return "apple";
//	    return new Fruits();
	}
	void growInColdWeather()
	{
		System.out.println("Apples grow in cold weather..");
	}
	@Override
	void eat()
	{
		System.out.println("eating a Apple....");
	}
	
	public static void main(String[] args) {
		// this is not allowed in java
		// Apple a = new Fruits();
		// Method overriding happens only when there is a ISA relationship (Parent child relationship)
		
		Fruits f = new Apple(); //top/up casting
		
		// Creating an object of Apple of type Fruits
		
		        // Access to
				// All IVs of Fruits
				// all methods of Fruits
				// all overridden methods from Apple (Child class)
		
		System.out.println(f.color + " : " + f.price + " : " + f.weight);
//		System.out.println(f.shape );
		f.makeaSalad();
		f.makeaJuice(); // getting called fro child class i.e Apple
		f.color = "RED";
		System.out.println("f.color  : " + f.color);
		
		System.out.println("----------------------------------------------------");
		
		Apple a = new Apple();
		a.makeaJuice();
		a.color = "Green"; //  preference to child class
		System.out.println("a.color : " + a.color);
	}
	
}
