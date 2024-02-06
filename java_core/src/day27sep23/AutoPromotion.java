package day27sep23;

public class AutoPromotion {
	static void m1(float a)
	{
		System.out.println("a = " + a);
	}
	static void m1(int b)
	{
		System.out.println("b = " + b);
	}
	static void m1(double d)
	{
		System.out.println("d = " + d);
	}
	
	static void m2(String str)
	{
		System.out.println(str);
	}
	public static void main(String[] args) {
		m1(12.23f);
		m1(12);
		m1('A');
		m1(1223343433l);
		//m2('A');
	}
}
