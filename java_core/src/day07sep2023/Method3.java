package day07sep2023;

public class Method3 {
	public static int add(int a, int b)
	{
		int res = a + b;
		return res;
	}
	public static void disp(int s)
	{
		System.out.println("final result : " + s);
	}

	public static void main(String[] args) {
	int a = 10, b = 20;
	int r = add(a,b);
	System.out.println("r = " + r); // 30
	
	int result = r * 100; //300
	disp(result);
	disp(result+100);
	}

}
