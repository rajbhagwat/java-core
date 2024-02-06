package day26sep23;

public class AutoPromotion {
	static void m1(int a, int b)
	{
		System.out.println("INT a : " + a + " b : "+ b);
	}
	public static void main(String[] args) {
		m1(1,2); // int, int
		
		byte b1 = 12, b2 = 13;
		m1(b1,b2); // byte , byte auto promotion
	}
}
