package day26sep23;

public class Student {
	int id;
	String name;
	int std;
	
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name= " + name + ", std=" + std  + std + "]";
	}
	
	public Student(int id)
	{
		this.id = id;
	}
	public Student(int id, String name) //int, String
	{
		this.id   = id+100;
		this.name = name;
	}
	public Student(String name, int id) // String, int
	{
		this.id   = id+500;
		this.name = name;
	}
	public Student(int id1, String name1, int std)
	{
		this(name1,id1); //this() will give a call to the constructor of the same class
		//  this(id1, name1);
		//this(id1, std); //Recursive constructor invocation Student(int, String, int)
		this.std = std;
	}
	void disp()
	{
		//this(200,"virat",10); //it has to be inside a constructor and not in any other method
		
	}
	Student getInstance()
	{
		//return new Student(1, "ASD",3);
		return this;
	}

	public static void main(String[] args) {
		Student s1 = new Student(1,"Virat",5); // int , String , int
		System.out.println(s1);
		Student s2 = s1.getInstance();

	}

}
