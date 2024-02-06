package day27sep23;

public class MethodOverloading {
	private void m1(int a)
	{
		System.out.println("in inside m1()");
	}
	// If I change accessmodifier and/or return data type of m1 method, still compiler will say it is duplicate method as we have not changed signature of m1()
	/*	public int m1(int a)
		{
			System.out.println("in side m1()");
			return 10;
		}
	*/
}
