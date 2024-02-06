package day3Oct23;

public class Country {
	String name;
	int population;
	static String capital;
	public String getName() {
		return name;
	}
	//getters & setters
	public void setName(String name) {
		this.name = name;
	}
	public int getPopulation() {
		return population;
	}
	public void setPopulation(int population) {
		this.population = population;
	}
	@Override
	public String toString() {
		return "Country [name=" + name + ", population=" + population +"]";
	    }
		//default contructor
		public Country() {
			super();
			System.out.println("I am in default 0 arg - Country constructor");
		}
		//2 arg contructor
		public Country(String name, int population)
		{
			super();
			this.name = name;
			this.population = population;
			
		}
		//1 arg contructor - name
		public Country(int population) {
			super();
			this.population = population;
		}
	
	
	
}
