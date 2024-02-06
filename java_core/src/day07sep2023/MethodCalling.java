package day07sep2023;

public class MethodCalling {
  public static void m1()
  {
	  System.out.println("m1() starts");
	  m2();
	  System.out.println("m1() ends");
  }
  public static void m2()
  {
	  System.out.println("m2() starts");
	  m3();
	  System.out.println("m2() ends");
  }
  public static void m3()
  {
	  System.out.println("m3() starts");
	  System.out.println("m3() method is being called...");
	  System.out.println("m3 () ends");
  }
  
	public static void main(String[] args) {
		System.out.println("Starts of program");
		m1();
		System.out.println("End of the program");

	}

}
