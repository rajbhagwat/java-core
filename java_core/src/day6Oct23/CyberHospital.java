package day6Oct23;

public class CyberHospital extends Hospital {

	

	@Override
	void medicalOfficer() {
		System.out.println("GovHospital has a medicle officer....");
	}
	CyberHospital()
	{
		super();
		System.out.println("I am in cyberHospital...");
	}
	@Override
	void Doctor() {
		System.out.println("I am inside a Doctor()");
		
	}
	public static void main(String[] args) {
		
		Hospital h;
		CyberHospital ch = new CyberHospital();
			ch.emergency();
			ch.O2Cylinder();
			ch.Doctor();
			ch.medicalOfficer();
			
			System.out.println("--------------------------------------------------------------");
			
			Hospital h1 = new CyberHospital();
			h1.emergency();
			h1.O2Cylinder();
			h1.Doctor();
			
	}
	@Override
	void wardBoy(int n) {
		// TODO Auto-generated method stub
		
	}
	@Override
	void wardBoy(float n) {
		// TODO Auto-generated method stub
		
	}
	

	
}
