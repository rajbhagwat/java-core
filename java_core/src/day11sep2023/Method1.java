// Demonstration of passing a primitive parameters to a method
// which displays its value. 
package day11sep2023;

public class Method1 {
	static void disp(int a, int b, int c)
	{
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		a=100;
	}

	public static void main(String[] args) {
	int a = 10, b = 20, c = 30;
	disp(a,b,c);
	System.out.println("a = " + a); //10
	}

}
