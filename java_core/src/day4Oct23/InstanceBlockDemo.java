package day4Oct23;

public class InstanceBlockDemo {
	int price;
	static int age;
	// instance block
	{
		this.price = 100;
		age = 120;
		System.out.println("I am in instance block#1");
	}
	{
		this.price = 300;
		age = 120;
		System.out.println("I am in instance block#2");
	}
		
	public static void main(String[] args) {
		System.out.println("I am inside main method");
		InstanceBlockDemo obj = new InstanceBlockDemo();
		System.out.println(obj.price); //300
		InstanceBlockDemo obj1 = new InstanceBlockDemo();
		System.out.println(obj.price); //300
		
	}
}
