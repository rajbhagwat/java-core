package day27sep23;

public class Tester extends Emp {
	boolean isAutomation;
	
	public Tester() {
		super();
		System.out.println("Tester constructor is being called");
	}
	
	void findBug()
	{
		System.out.println("finds bug");
	}
	public static void main(String[] args) {
		Tester t = new Tester();
	}
}
