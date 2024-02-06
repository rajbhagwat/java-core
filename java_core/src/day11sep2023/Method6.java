package day11sep2023;

public class Method6 {
	static boolean checkForPerfectNo(int n)
	{
	int sum = 0;
	for (int div = 1; div < n; div++) 
		if (n%div == 0) 
			sum = sum + div;
	 if (sum == n)
		 return true;
		 else 
			 return false;
	}

	public static void main(String[] args) {
		int MaxPerfectCnt = 2;
		int pCnt = 0;
		if(MaxPerfectCnt > 0 )
		{
			for (int n = 1; pCnt < MaxPerfectCnt; n++) {
				if (checkForPerfectNo(n))
				{
					System.out.println(n + "is a PERFECT no");
					pCnt++;
				}
			}
		}
		else
			System.out.println("Invalid Max Perfect No value !!!!");
		
	}

}
