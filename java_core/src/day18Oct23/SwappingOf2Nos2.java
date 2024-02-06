package day18Oct23;

public class SwappingOf2Nos2 {

	public static void main(String[] args) {
		int a = 10, b = 20, t;
		System.out.println("Original values: ");
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("Changed values: ");
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);

	}

}
