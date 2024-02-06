package day18Oct23;

public class StudentRunner {
	private static void m1(Student s) {
		 s.rollNo = 200;
		 s.name = "Rohit";
	}
	public static void main(String[] args) {
		Student s1 = new Student(100,"Virat");
		System.out.println(s1);
		m1(s1);
		System.out.println(s1);
			
	}


}
