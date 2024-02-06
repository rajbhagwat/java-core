package day07sep2023;

public class Method4 {
	public static void m1(int b)
	{
		System.out.println("m1 () starts");
		System.out.println("b = " + b);
		b=b+100;
		m2(b);
		System.out.println("m1 () ends");
	}
	
	public static void m2(int c)
	{
		System.out.println("m2 () starts");
		System.out.println("c = " + c);
		c=c+100;
		m3(c);
		System.out.println("m2 () ends");
	}
	public static void m3(int d)
	{
		System.out.println("m3 () starts");
		System.out.println("d = " + d);
		d=d+100;
		System.out.println("m3 () ends");
	}

	public static void main(String[] args) 
	{
		int a = 100;
		System.out.println("Starts of program");
		m1(100);
		System.out.println("a = " + a);
		System.out.println("End of program");
	}

}
