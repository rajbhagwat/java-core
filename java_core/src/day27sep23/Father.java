package day27sep23;

public class Father extends GrandFather {
	int age;
	
	Father work(int salary)
	{
		System.out.println("Father works in Govt....salary: " + salary);
		return new Father();
		
	}
	public Father() {
		super();
		System.out.println("Father constructor is being called");
	}
}
