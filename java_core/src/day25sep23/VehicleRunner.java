package day25sep23;

public class VehicleRunner {
	
	
	public static void main(String[] args) {
		Engine e1 = new Engine(2,  1);
		Vehicle v = new Vehicle("MH20 GB 3546", 2, "FZ5", e1);
		System.out.println(v.toString());

	}

}
