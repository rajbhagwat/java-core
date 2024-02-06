package day21sep23;

public class Student {
	int rollNo;
	String name;
	
	//zero parameterised contructror
	Student() {
		System.out.println("I am in Zero parameterised contructor...");
	}
	
	//1 parameter rollno contructor
	Student(int rollNo)
	{
		System.out.println("I am in 1 parameterised ROLLNO contructor...");
		      this.rollNo = rollNo;
	}
	
	//1 parameter name contructor
	Student(String name)
		{
			System.out.println("I am in 1 parameterised name contructor...");
			      this.name = name;
		}
	// 2 parameters rollno and name constructor
	Student(int rollNo, String name)
	{
		System.out.println("I am in 2 parameterised ROLLNO , NAME contructor...");
		this.rollNo = rollNo;
		this.name   = name;
	}
	// 2 parameters name and rollno constructor
	Student(String name, int rollNo)
	{
		System.out.println("I am in 2 parameterised  NAME , ROLLNO contructor...");
		this.rollNo = rollNo;
		this.name   = name;
	}
	void disp() 
	{
		System.out.println(this.rollNo + " : " + this.name);
		
	}
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.disp();
		Student s2 = new Student(101);
		s2.disp();
		
		Student s3 = new Student("Raj");
		s3.disp();
		
		Student s4 = new Student(202, "Kalpesh");
		s4.disp();
		
		Student s5 = new Student("Mahesh", 303);
		s5.disp();
	}
}
