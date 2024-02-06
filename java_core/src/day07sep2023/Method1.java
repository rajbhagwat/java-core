package day07sep2023;

public class Method1 {
	public static void add(int a, int b)
	{
		System.out.println("a = " + a);
		System.out.println("b " + b);
		int res = a + b;
		System.out.println("Addition = " + res); //30
		a = 100; b = 200;
		System.out.println("add() -> a = " + a); //100
		System.out.println("add() -> b = " + b); //200
	}

	public static void main(String[] args) {
		int a = 10, b = 20;
		add(a,b);  // calling method add
		System.out.println("a = " + a); //10
		System.out.println("b = " + b); //20
		

	}

}
