package day25sep23;

public class School {
	String name;
	int NoOfStudents;
	ClassRoom c;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNoOfStudents() {
		return NoOfStudents;
	}
	public void setNoOfStudents(int noOfStudents) {
		NoOfStudents = noOfStudents;
	}
	public ClassRoom getC() {
		return c;
	}
	public void setC(ClassRoom c) {
		this.c = c;
	}
	@Override
	public String toString() {
		return name + " : " + NoOfStudents + " : " + c;
	}
	public static void main(String[] args) {
		School s = new School();
		s.setName("NES");
		s.setNoOfStudents(1200);
		ClassRoom c1 = new ClassRoom();
		c1.capacity = 40;
		s.setC(c1);
		
		System.out.println(s.toString());
	}
}
