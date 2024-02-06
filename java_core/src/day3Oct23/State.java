package day3Oct23;

public class State extends Country {
	String name;
	int population;
	String capital;
	float area;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
		super.name = "INDIA";
	}
	public int getPopulation() {
		return population;
	}
	public void setPopulation(int population) {
		this.population = population;
	}
	@Override
	public String toString() {
		return "State [name=" + name + ", population=" + population + "]";
	}
	public State(String name, int population)
	{
		super(name, population); // invoke constructor of parent 
		System.out.println("I m inside defautl 2 arg State Constructor...");
		this.name = name;
		this.population = population;
	}
	public State(int population) {
		super();
		this.population = population;
	}
	
	void disp()
	{
		super.name = "AAAAA";
	}
 
	public static void main(String[] args) {
		
		State s = new State("UP", 240000000);
		 
	}
}
