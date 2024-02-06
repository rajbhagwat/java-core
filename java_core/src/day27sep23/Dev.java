package day27sep23;

public class Dev extends Emp{
	String techSkill;
	public Dev()
	{
		System.out.println("Dev constructor is being called");
	}
	void coding()
	{
		System.out.println("DEV Codes");
	}
	public static void main(String[] args) {
		Dev d = new Dev();
	}

}
