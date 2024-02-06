package day6Oct23;

public class Audi extends Car {
	@Override
	void m2() {
		 System.out.println("m2() implemented");
		
	}

	@Override
	void m3() {
		 System.out.println("m3() implemented");
	}
	public static void main(String[] args) {
		Audi a = new Audi();
		a.m1();
		a.m2();
		a.m3();
	}
}
