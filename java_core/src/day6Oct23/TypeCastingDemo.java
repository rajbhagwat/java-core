package day6Oct23;

public class TypeCastingDemo {

	public static void main(String[] args) {
		
		byte b = 12;
		int i = b;
		System.out.println(b + " : " + i);
		
		long l = 123123123l;
		float f = l;
		System.out.println(f + " : " + l);
		
		char ch = (char) i;

	}

}
