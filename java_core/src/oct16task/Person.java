package oct16task;

	public class Person{
		//instance variable
		String name;
		int    age;
		char   gender;
		
		public Person() {
			name = "Virat";
			age = 25;
			gender = 'M';
		}
		
		//  Parameterized constructor
		Person(String n, int a, char g){
			name   = n;
			age    = a;
			gender = g;
		}
		//static method
		static void print(Person p)
		{
			System.out.println("Name   : " + p.name);
			System.out.println("Age    : " + p.age);
			System.out.println("Gender : " + p.gender);
		}
			
		
		
		
		void display() {
			System.out.println("Name   : " + name);
			System.out.println("Age    : " + age);
			System.out.println("Gender : " + gender);
		}
	
	
	
		public static void main(String[] args) {
			Person p = new Person();                   // default constructor
			Person p1 = new Person("Rohit", 30, 'M');  // parameterized constructor
			Person p2 = new Person("Dhoni", 35, 'M');  // static 
			
			System.out.println("constructor default ");
			
			System.out.println("Name:  " + p.name);
			System.out.println("Age: " + p.age);
			System.out.println("Gender: " + p.gender);
			
			System.out.println("Parameterized constructor");
			p1.display();
			System.out.println("static");
			Person.print(p2);
		}
	}


