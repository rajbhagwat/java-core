package day4Oct23;

public class Child extends Parent {
	{
		System.out.println("Instance block - Child-> I am in Child class");
	}
	Child()
	{
		super();
	}
	public static void main(String[] args) {
		Child c = new Child();

	}

}
