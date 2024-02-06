package day17Oct23;

public class PrimeNoUsingMethod {
	
	static boolean verifyPrimeNo (int n)
	{
		int in = 0;
		int no = n;
		for (int div = 2; div<=(no/2); div++) {
			int r;
			r = no % div;
			if (r == 0)
			{
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
		int [] arr = {4,3,21,23,29,12};
		// 3 23 29
		for (int i = 0; i < arr.length; i++) {
			boolean res = verifyPrimeNo(arr[i]);
			if(res)
				System.out.println(arr[i]+ "is a PRIME no");
		}
	}
}
