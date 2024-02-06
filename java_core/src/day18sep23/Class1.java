package day18sep23;

public class Class1 {
	// instance variables / non static variables 
	int price;
	String name;
	
	static String brand; // class variables/ global variable/not associated with an object 
	
	// non static method
	void m1()
	{
		System.out.println("m1() method is being called...");
	}
	
	//non static method
	void disp()
	{
		System.out.println("disp - non static method is being called....");
		
		/*     1. static variable    : YES 
	       2. static method      : YES 
	       3. non static variable: YES 
	       4. non static method  : YES 
	*/
		
		System.out.println("brand => " + brand);
		print();  //static method
		System.out.println("name  : " + name);
		m1(); //calling non static method
		
	}
	
	//static method
	static void print()
	{
		brand = "Apple";
		System.out.println("print()->brand : " + brand);
	}
		//static method
		static void show()
		   {
		       Class1.print();
		   }
		
	
	public static void main(String[] args) {
		int color;
		
		Class1 obj = new Class1();
		System.out.println(obj.price);
		System.out.println(obj.name);
		obj.disp();
		
		Class1.brand = "one+";
		System.out.println("brand : " + Class1.brand);
		
		Class1.print(); // getting called from main method
		Class1.show();
		System.out.println("------------------from non static method -------------->");
		obj.disp(); // trying to access static variable : brand
	}

}
