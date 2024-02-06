package day26sep23;

public class AddMethodOverloading {
	
	static int add(int a, int b)
	{
		return a + b;
	}
	static float add(float x, float y)
	{
		return x + y;
	}
	static int add(int a, int b, int c)
	{
		int r;
		r = a + b + c;
		return r;
	}
	static void add(int a, String s1, String s2, String s3)
	{
		System.out.println(a + " " + s3 + " " + s1 + " " + s2);
	}
	void add()
	{
		System.out.println("calling add() method from main method");
	}
	public static void main(String[] args) {
		int res = add(1,2);
		System.out.println("yes : "+ res);
		
		res = add(10,20);
		System.out.println("res : " + res);
		
		float result = add(10.1f, 12.3f);
		System.out.println("result : " + result);
		
		System.out.println(add(10,20,30));
		
		add(10,"cyber","success","center");
		
		AddMethodOverloading obj = new AddMethodOverloading();
		obj.add();
	}
}
