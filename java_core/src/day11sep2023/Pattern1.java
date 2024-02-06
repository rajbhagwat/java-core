package day11sep2023;

public class Pattern1 {

	public static void main(String[] args) {
    for (int i = 1; i < 5; i++) {
		System.out.println("*");
		System.out.println();
	}
	}

}
class Pattern2
{
  public static void main(String[] args) {
	int maxCol=5;
	for (int j = 1; j <=5; j++) {
		{
			for (int i = 1; i <=maxCol; i++)
				System.out.println("*");
			maxCol--;
			System.out.println();
		}
	}
}	
  class Pattern3
  {
	  public static void main(String[] args) {
		int maxCol=1;
		for (int j = 0; j <=5; j++) {
			for (int i = 1; i <=5; i++) 
				System.out.println("*");
			maxCol++;
			System.out.println();
		}
	}
  }
}
