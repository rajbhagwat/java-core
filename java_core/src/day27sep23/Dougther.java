package day27sep23;

public class Dougther extends Father {
	Dougther()
	{
		super();
		System.out.println("Doughter constructor is being called...");
	}
	Dougther work(int salary)
	{
		System.out.println("Doughter works in Private sector salary : " + salary);
		return new Dougther();
		
	}
	public static void main(String[] args) {
		Dougther d = new Dougther();
		d.work(100000);
	}

}
