package day10Oct23;

public interface I1 {
	// all variables declared in an interface is by default public static final 
	public static final float INTEREST_RATE=7.8f;
	
	public abstract void m1(); // abstract method
	void m2();
	void m3();
	void m4();
}

interface I2
{
	void m5();
}

class C1 implements I1, I2
{
	void disp()
	{
		System.out.println("***********************************************************");
		
	}

	@Override
	public void m1() {
		System.out.println("m1 method from c1 class invoked...");
		
	}

	@Override
	public void m2() {
		System.out.println("m2 method from c1 class invoked...");
		
	}

	@Override
	public void m3() {
		System.out.println("m3 method from c1 class invoked...");
		
	}

	@Override
	public void m4() {
		System.out.println("m4 method from c1 class invoked...");
		
	}

	@Override
	public void m5() {
		System.out.println("m5 method from c1 class invoked...");
		
	}
	public static void main(String[] args) {
//		I1 i1 = new I1(); // can not create an instance of interface
// IQ: Can we create an object of interface? NO 		
// can I define variable in an interface? if yes, what would be it non access 
//		modifiers?
		C1 c = new C1();
		c.m1();
		c.m2();
		c.m3();
		c.m4();
		System.out.println("int rate: " + I1.INTEREST_RATE);
//		I1.INTEREST_RATE = 12.23f; // not allowed as it is defined as a final 
		c.m5();
		
		I1   c2  = new C1();
		
		System.out.println("int rate: " + c2.INTEREST_RATE);
		c2.m1();
		c2.m2();
		c2.m3();
		c2.m4();
		
		I2 c3 = new C1();
		c3.m5();
	}
	
}
