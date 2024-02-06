package day17Oct23;

public class PrimeNo {

	public static void main(String[] args) {
		int[] arr = {4,3,21,23,29,12};
		//3 23 29
		int no, in = 0;
		for (int i = 0; i < arr.length; i++) {
			in = 0;
			no = arr[i];
			for (int div = 2; div <=(no/2); div++) {
				int r;
				r = no % div;
				if (r == 0)
				{
					in = 1;
					break;
				}
			}
			if (in == 0)
				System.out.println(no + "is a PRIME no");
		}

	}

}
