package day26sep23;

public class MainMethodOverloading {

	public static void main(String[] args) {
		System.out.println("inside main method");
		main(100);

	}
	public static void main(int a)
	{
		System.out.println("inside main (a) method a: " + a);
	}

}
