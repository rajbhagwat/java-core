package day3Oct23;

public class ExampleOfStaticBlock {
	static int age;
	int price;
	static {
		age = 10;
//		System.out.println("price : " + price);  // non static variables are not allowed in static block
		
	}
	static {
		age++;
	}
	static {
		++age;
	}
	static {
		age = age + 10;
	}
	public static void main(String[] args) {
		System.out.println(ExampleOfStaticBlock.age);
	}
}
