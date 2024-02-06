package day6Oct23;

public abstract class Hospital extends GovHospital {
	
	public Hospital() {
		System.out.println("Hospital constructor...");
	}
	void emergency()
	{
		System.out.println("emergency ward is available");
		
	}
	void O2Cylinder()
	{
		System.out.println("O2Cylinder are present");
	}
	
	abstract void Doctor();
	abstract void wardBoy(int n);
	abstract void wardBoy(float n);
}
