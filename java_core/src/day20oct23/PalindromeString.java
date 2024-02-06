package day20oct23;

public class PalindromeString {

	public static void main(String[] args) {
		String str = "RAJ";
		//String str = "KALPESH";
		
		for (int i = 0; i < str.length(); i++) 
			System.out.println("str.charAt(" + i + "): " + str.charAt(i));
		String revStr = "";
		for (int i = str.length()-1; i >=0; i--) 
			revStr = revStr + str.charAt(i);
			System.out.println("revStr : " + revStr);
			if (str.equals(revStr)) 
				System.out.println(str + " is a palindrome :");
			else
				System.out.println(str + "is NOT a palindrome !");
			System.out.println(str + " : " + System.identityHashCode(str));
			System.out.println(revStr + " : " + System.identityHashCode(revStr));
		
		

	}

}
