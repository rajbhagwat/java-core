package day17Oct23;

public class PerfectNoUsingMethod2 {
	
	static void verifyPerfectNo(int[] ar)
	{
		for(int i=0;i<ar.length;i++)
		{
			int sum = 0, no=ar[i];
			for(int div=1;div<=no/2;div++)
			{
				if (no%div == 0)
					sum = sum + div;
			}
			if (no == sum)
				System.out.println(no + " is A PERFECT no");
		}
	}
		
		public static void main(String[] args) {
			int[]arr = {12,6,23,8,496,90,28};
			// 6 28 496
			verifyPerfectNo(arr);
	}
	

}
