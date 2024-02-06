package day29nov23;

class Student 
	{
		int rollNo;
		String name;
		public Student (int rollNo, String name) {
			super();
			this.rollNo = rollNo;
			this.name = name;
			
		}
		public int getRollNo() {
			return rollNo;
					
		}
		public void setRollNo(int rollno) {
			this.rollNo = rollno;
			
		} 
		public String getName() {
			return name;
			
		}
		public void setName(String name) {
			this.name = name;
			
		}
		@Override
		public String toString() {
			return "Student [rollNo=" + rollNo + ", name=" + name + "]";
		}
		
	}
	public class ObjectComparison {

		public static void main(String[] args) {
		
		Student s1 = new Student(11,"Rohit");
		Student s2 = new Student(11,"Rohit");
		System.out.println(s1.hashCode() + " : " + s2.hashCode());
		/*	if (s1==s2)
		System.out.println("s1 is SAME as s2");
	else
		System.out.println("s1 is NOT SAME as s2");
*/
		if (myEquals(s1,s2))
		System.out.println("s1 is SAME as s2");
	else
		System.out.println("s1 is NOT SAME as s2");
   }	
	static boolean myEquals(Student s1, Student s2)
	{
		if (s1.getRollNo() == s2.getRollNo() && 
				s1.getName().equals(s2.getName()))
			return true;
		else
			return false;

	}
	}

