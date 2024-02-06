package day20oct23;

public class MethodsDemo {

	public static void main(String[] args) {
		String str = "Pune";
		
		System.out.println(str.length());
		
		System.out.println(str.charAt(3));//e
//		System.out.println(str.charAt(4)); // StringIndexOutOfBoundsException
//		System.out.println(str.charAt(-1));// StringIndexOutOfBoundsException
//		
//		str = null;
//		System.out.println(str.length()); //NullPointerException 
		
		String s1 = "I am";
		String s2 = "Learning Java";
		
		System.out.println(s1.concat(s2).concat("at Cyber Success"));
		
		System.out.println(s1.concat(s2).concat("at cyber Success").length()); //method chaining
		
		s1 = s1.concat(s2).concat("at cyber success"); // i am learning Java at Cyber Success
		System.out.println(s1 + " : " + s1.length());
		
		boolean res  = s1.contains("Java");
		System.out.println("res : " + res); //true
		
		res = s1.contains("java");
		System.out.println("res : " + res); // false
		
		System.out.println("s1.contains(\"   \"): " + s1.contains("")); //true
		
		System.out.println(s1.contains("z")); //false
	}

}
