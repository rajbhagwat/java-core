package day11sep2023;

//import java.util.Iterator;

public class Method4 {
	static boolean checkForPrimeNo(int n)
	{
		int in = 0;
		for (int div = 2; div <=n/2; div++)
		{
		  if (n%div==0) {
			in = 1;
			break;
		}	
		}
		if (in == 0) 
			return true;
		else 
			return false;
	}

		public static void main(String[] args) {
			int MaxPrimeCnt = 10,pCnt=0;
			for (int n = 2; pCnt < MaxPrimeCnt; n++) {
				if (checkForPrimeNo(n)) // res == true
				{
					System.out.println(n + " is a PRIME no");
					pCnt++;
				
				}
			}

	}

}
