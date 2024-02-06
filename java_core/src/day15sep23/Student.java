package day15sep23;

public class Student {
	// instance variables/non static variables
	int id;
	String name;
	void disp()
	{
		System.out.println("Displaying student's information");
		
	}

	public static void main(String[] args) {
		Student s1 = new Student();
		System.out.println(s1.hashCode());
		Student s2 = s1;
		System.out.println(s2.hashCode());

	} // end of the main method

}  // end of the class
