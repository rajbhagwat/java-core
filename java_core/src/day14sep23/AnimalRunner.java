package day14sep23;

public class AnimalRunner {

	public static void main(String[] args) {
		Animal ani1 = new Animal();
//		Animal ani2 = new Animal();
//		Animal ani3 = new Animal();
//		Animal ani4 = new Animal();
		
		ani1.eat();
		System.out.println("ani1.color    : " + ani1.color); // null
		System.out.println("ani1.gender   : " + ani1.gender); // ''
		System.out.println("ani1.isPet    : " + ani1.isPet); //false
		System.out.println("ani1.weight   :  " + ani1.weight); //0.0
		System.out.println("ani1.noOfHorns : " + ani1.noOfHorns); //0
		ani1.run();
		System.out.println("--------------values--------------------");
		
		ani1.color     = "brown";
		ani1.gender    = 'M';
		ani1.isPet     = true;
		ani1.weight    = 100;
		ani1.noOfHorns = 2;
		System.out.println("ani1.color    : " + ani1.color);
		System.out.println("ani1.gender   : " + ani1.gender); 
		System.out.println("ani1.isPet    : " + ani1.isPet); 
		System.out.println("ani1.weight   :  " + ani1.weight); 
		System.out.println("ani1.noOfHorns : " + ani1.noOfHorns); 
		
		System.out.println("-----------------overwritten values----------------------");
		
		ani1.color     = "black";
		ani1.gender    = 'f';
		ani1.isPet     = false;
		ani1.weight    = 80;
		ani1.noOfHorns = 0;
		
		System.out.println("ani1.color    : " + ani1.color);
		System.out.println("ani1.gender   : " + ani1.gender); 
		System.out.println("ani1.isPet    : " + ani1.isPet); 
		System.out.println("ani1.weight   :  " + ani1.weight); 
		System.out.println("ani1.noOfHorns : " + ani1.noOfHorns); 
		
		
		

	}

}
