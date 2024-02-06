package day4Oct23;

public class Animal {
	private static Animal instance = null;
	private Animal()
	{
		
	}
	public static Animal getInstance()
	{
		if(instance == null)
			instance = new Animal();
		
		return instance;
	}
}
