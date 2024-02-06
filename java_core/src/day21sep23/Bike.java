package day21sep23;

public class Bike {
	int speed;
	String name;
	
	Bike(int speed, String name)
	{
		if (speed > 0 )
		{
		   	this.speed = speed;
		   	this.name  = name;
		}
	}
	void disp()
	{
		System.out.println(this.name  + "  :  "  + this.speed);
	}

	public static void main(String[] args) {
		Bike b1 = new Bike(-100, "Hero Honda");
		b1.disp();

	}

}
