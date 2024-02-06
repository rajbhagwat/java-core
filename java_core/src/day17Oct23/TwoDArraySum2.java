package day17Oct23;

public class TwoDArraySum2 {

	public static void main(String[] args) {
		int[][] ar = new int[][] {
			{1,29,3},
			{4,15,6},
			{27,8,9}
		};
		int max=ar[0][0];
		for (int r = 0; r < ar.length; r++) {
			for (int c = 0; c < ar.length; c++) {
				if(ar[r][c]>max)
					max = ar[r][c];
			}
		}
		System.out.println("Max = " + max);

	}

}
