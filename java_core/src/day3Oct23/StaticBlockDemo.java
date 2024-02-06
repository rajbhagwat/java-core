package day3Oct23;

public class StaticBlockDemo {
	static int std = 12;
	
	static
	{
		System.out.println("I am inside static block # 2");
		std = std + 100;
		System.out.println("std : " + std); //112
	}
	static
	{
		System.out.println("I am inside static block # 1");
		std = std + 8; // 120
		System.out.println("std : " + std); //120
	}
	
	
	
	public static void main(String[] args) {
		System.out.println("WElcome to static block demonstrataion");
	}
}
