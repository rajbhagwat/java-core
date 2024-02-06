package day10Oct23;

public class Tiger implements DomesticAnimal, WildAnimal {

	@Override
	public void eat() {
		 System.out.println("Both types of animals eat !!!!");
		
	}
	public static void main(String[] args) {
		Tiger tiger = new Tiger();
		tiger.eat();

		
		DomesticAnimal da = new Tiger();
		da.eat();
		WildAnimal wa = new Tiger();
		wa.eat();
	}
	
}
