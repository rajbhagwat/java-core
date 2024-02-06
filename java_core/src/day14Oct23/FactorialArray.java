package day14Oct23;

public class FactorialArray {

	public static void main(String[] args) {
		int[] arr = {5,4,3,2,1};
		
		int n = 5;
//		3 * 2 * 1 = 5;
//		n * n-1 *  n-2 = Fact
		
		int s = 0;
		for (int j = 0; j < arr.length; j++) {
			int no = arr[j];
			int mult = 1;
			for (int i =no; i >=1; i--) 
				mult = mult * i;
			System.out.println("fact of " + no + " : " + mult);
			s = s + mult;
		}
		System.out.println("sum of fact : " + s);

	}

}
