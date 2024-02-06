package day20oct23;

public class StringDemo {

	public static void main(String[] args) {
		//Way# using literal
		String s1 = "Pune";
		String s2 = "Mumbai";
		System.out.println(s1 + " : " + System.identityHashCode(s1));
		System.out.println(s2 + " : " + System.identityHashCode(s2));
			
			String s3 = "Pune";
			System.out.println(s3 + " : " + System.identityHashCode(s3));
			
				String s4 = "Pune";
				System.out.println(s4 + " : " + System.identityHashCode(s4));
				
					s1 = "Mumbai";
					System.out.println(s1 + " : " + System.identityHashCode(s1));
					
		//Way#2: using new keybord
					String s5 = new String("Pune");
					System.out.println(s5 + " : " + System.identityHashCode(s5));
					String s6 = new String("Pune");
					System.out.println(s6 + " : " + System.identityHashCode(s6));
					
						if(s5 == s6) // reference/memory location
							System.out.println("s5 and s6 are SAME");
						else
							System.out.println("s5 and s6 are NOT SAME");
						if(s5.equals(s6)) //content
							System.out.println("s5 and s6 CONTENT is SAME");
						else
							System.out.println("s5 and s6 CONTENT IS NOT SAME");
						
		//literal way
						System.out.println("s2 : " + s2 + " : " + System.identityHashCode(s2));
						System.out.println("s3 : " + s3 + " : " + System.identityHashCode(s3));
							if(s2 == s3) //reference/memory location
								System.out.println("s2 and s3 reference are SAME");
							else
								System.out.println("\"s2 and s3 reference are NOT SAME");
	}

}
