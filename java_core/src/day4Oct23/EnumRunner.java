package day4Oct23;

public class EnumRunner {
	static void m1(Directions d)
	{
		System.out.println(d);
	}
 
	public static void main(String[] args) 
	{
		/*
		 * System.out.println(Directions.EAST); System.out.println(Directions.WEST);
		 * System.out.println(Directions.NORTH); System.out.println(Directions.SOUTH);
		 */		
		
		m1(Directions.EAST);
		m1(Directions.WEST);
}
}

