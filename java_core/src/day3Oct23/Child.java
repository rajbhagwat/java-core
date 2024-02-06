package day3Oct23;

public class Child extends Parent  ///Is A Relationship
{
	
	@Override
	public void m1() {
		System.out.println("i am in m1() method of Child class");
	}
	Child()
	{
		System.out.println("Child constructor is being called..");
	}

	public static void main(String[] args) {
		Child c1 = new Child();
		System.out.println(c1.getAge());

	}

}
