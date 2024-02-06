package day20oct23;

public class CharArrayString {

	public static void main(String[] args) {
		char[] str1 = {'p','u','n','e'};
		
		System.out.println(str1);
		System.out.println(System.identityHashCode(str1));
			char[] str2 = {'p','u','n','e'};
			
			System.out.println(str2);
			
		System.out.println(System.identityHashCode(str2));
		System.out.println("str1==str2 => " + (str1==str2));
		
		//below statement gives wrong answer as false Need to check
		//System.out.println("str1.equals(str2) => " + (str2.equals(str1)));

	}

}
