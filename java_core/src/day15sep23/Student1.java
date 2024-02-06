package day15sep23;

public class Student1 {
	int id;
	String name;
	//non static method
	void disp()
	{
		System.out.println("Displaying student1 info....");
	}
	
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.id = 100;
		s1.name = "Raj";
		System.out.println("s1.id    : " + s1.id);
		System.out.println("s1.name  : " + s1.name);
		
		s1.disp();
		
		Student s2 = s1;
		System.out.println("s2.id    : " + s2.id);
		System.out.println("s2.name  : " + s2.name);
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());

	}

}
