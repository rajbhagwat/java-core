package day17Oct23;

public class PerfectNo {

	public static void main(String[] args) {
		int[] arr = {12,6,23,8,496,90,28};
		//6 28 496
		
		int sum;
		for (int i = 0; i < arr.length; i++) {
			int no = arr[i];
			sum = 0;
			for (int div = 1; div<=no/2; div++) {
				if(no%div == 0)
					sum = sum + div;
				
			}
			if (no == sum)
				System.out.println(no + "is a PERFECT no");
		}

	}

}
