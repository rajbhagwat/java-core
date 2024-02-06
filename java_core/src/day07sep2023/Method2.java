package day07sep2023;

public class Method2 {
public static int add(int a, int b)
{
  int res = a + b;
  return res;
}
	public static void main(String[] args) {
		int a = 10, b = 20;
		int r = add(a,b);
		System.out.println("r = " + r);
		a = 100;
		b = 300;
		System.out.println("addition : " + add(100,300));
		System.out.println("addition of " + a + " and " + b + " = " + add(100,300));

	}

}
