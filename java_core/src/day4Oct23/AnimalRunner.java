package day4Oct23;

public class AnimalRunner {
	
	public static void main(String[] args) {
//		Animal a = new Animal();
			Animal a = Animal.getInstance();
			System.out.println(a.hashCode());
			Animal b = Animal.getInstance();
			System.out.println(b.hashCode());
			
			Animal c = Animal.getInstance();
			System.out.println(c.hashCode());
			Animal d = Animal.getInstance();
			System.out.println(d.hashCode());
			Animal e = Animal.getInstance();
			System.out.println(e.hashCode());
	}
}
