package day10Oct23.defaultMethod;

public interface I1 {
	void m1();
	default void m2()
	{
		System.out.println("default method m2 is being called..");
		m4();
	}
	static void m3()
	{
		System.out.println("m3 method is being called from I1 interface");
	}
	private void m4()
	{
		System.out.println("m4 private method is invoked");
	}
}
