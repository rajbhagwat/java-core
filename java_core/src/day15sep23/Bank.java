package day15sep23;

public class Bank {
	// instance variables/non static variables
	int acNo;
	String name;
	float balance;
	
	// non static method
	void showBalance()
	{
		System.out.println("Showing Balance");
	}
	
	public static void main(String[] args) {
		/*     System.out.println("acNo    : " + acNo);
	     System.out.println("name    : " + name);
	     System.out.println("balance : " + balance);
	     showBalance();
	*/
		
		Bank b1 = new Bank();
		System.out.println("b1.acNo   : " + b1.acNo);
		System.out.println("b1.name   : " + b1.name);
		System.out.println("b1.bal    : " + b1.balance);
		
		b1.showBalance();
		b1.acNo = 515253000;
		b1.name = "Raj Patil";
		b1.balance = 10000000.45f;  // 1.0E7
		System.out.println("b1.acNo   : " + b1.acNo);
		System.out.println("b1.name   : " + b1.name);
		System.out.println("b1.bal    : " + b1.balance);
		b1.showBalance();
	}

}
