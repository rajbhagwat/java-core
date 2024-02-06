package day4Oct23;

public class Car extends Vehicle{
	
	

	@Override
	void disp() {
		
		System.out.println("disp() method is being called from Car class ");
	}

	public static void main(String[] args) {
		Car c = new Car();
		c.disp();//child's disp() will be called 

	}

}
