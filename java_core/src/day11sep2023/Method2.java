package day11sep2023;

public class Method2 {
	static void checkForPrimeNo(int n)
	{
		int in = 0;
		for(int div = 2; div<n/2;div++)
		{
			if (n%div==0)
			{
				in = 1;
				break;
			}
		}
		if (in == 0)
			System.out.println(n + "is a PRIME no");
		else
			System.out.println(n + "is NOT A PRIME no");
	}

	public static void main(String[] args) {
		int n = 19;
		checkForPrimeNo(n);

	}

}
