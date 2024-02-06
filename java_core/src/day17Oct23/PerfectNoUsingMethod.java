package day17Oct23;

public class PerfectNoUsingMethod {
	

	static boolean verifyPerfectNo(int n)
	{
	
			int sum = 0, no=n;
			for(int div=1;div<=no/2;div++)
			{
				if (no%div == 0)
					sum = sum + div;
			}
			if (no == sum)
				return true;
			else
				return false;
		}
		
	
	public static void main(String[] args) {
		int[]arr = {12,6,23,8,496,90,28};
		// 6 28 496
		
		for (int i = 0; i < arr.length; i++) 
			if (verifyPerfectNo(arr[i]))
				System.out.println(arr[i] + "is a PERFECT no");

	}

}
