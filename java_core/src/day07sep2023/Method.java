package day07sep2023;

public class Method {
	public static void add(int a, int b)
	{
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		int res = a + b;
		System.out.println("Addition = " +res); //return take the control back to the caller method
	}

	public static void main(String[] args) {
    add(10,20); // calling a method add
//    cannot find sysmbol
//    System.out.println("a = " + a);
//	System.out.println("b = " + b);
    add(40,10); //actual arguments
	}

}
