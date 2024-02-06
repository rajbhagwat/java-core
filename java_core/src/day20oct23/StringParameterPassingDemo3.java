package day20oct23;

public class StringParameterPassingDemo3 {
	private static void m1 (char[] s1)
	{
		s1[0] = 'A';
		s1[1] = 'B';
		s1[2] = 'C';
		s1[3] = 'D';
		System.out.println("inside m1 s1: " + s1);
		
	}
	public static void main(String[] args) {
		char[] s1 = {'P','u','n','e'};
		System.out.println("before m1 calling s1=" + s1);
		m1(s1);
		System.out.println("after calling m1 s1=" + s1);
		for(char c : s1) {
			System.out.println(c);
		}
	}
	

}
