package day10Oct23.defaultMethod;

public class C3 implements I1 {
	@Override
	public void m1() {
		System.out.println("C3->m1 from I1 implemented");
	}
	public static void main(String[] args) {
		I1 obj = new C3();
		obj.m1();
		obj.m2();
		I1.m3();
	}
}
