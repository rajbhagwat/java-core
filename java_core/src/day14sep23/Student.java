package day14sep23;

public class Student {
	int rollNo;
	String name;
	String schName;
	
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.rollNo  = 1;
		s1.name    = "Raj";
		s1.schName = "NES";
		
		Student s2 = new Student();
		s2.rollNo  = 2;
		s2.name    = "Rohit";
		s2.schName = "NES";
		
		Student s3 = new Student();
		s3.rollNo  = 3;
		s3.name    = "Shikhar";
		s3.schName = "NES";
		
		System.out.println(s1.rollNo + " : " + s1.name + " : " + s1.schName);
		System.out.println(s2.rollNo + " : " + s2.name + " : " + s2.schName);
		System.out.println(s3.rollNo + " : " + s3.name + " : " + s3.schName);

	}

}
