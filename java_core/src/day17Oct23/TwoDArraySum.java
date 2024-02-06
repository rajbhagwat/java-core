package day17Oct23;

public class TwoDArraySum {

	public static void main(String[] args) {
		int[][] ar = {
				{10,20},
				{30,40},
				{50,60}
		};
		System.out.println("row length: " + ar.length); // 3
		System.out.println("1st row col length: " + ar[0].length); // 2
		System.out.println("2nd row col length: " + ar[1].length); // 2
		System.out.println("2nd row col length: " + ar[2].length); // 2
		int sum = 1;
		for(int r=0;r<ar.length;r++)
		{
			for(int c=0;c<ar[r].length;c++)
			{
				sum = sum * ar[r][c];
			}
			
		}
		System.out.println("sum = "+ sum);		
	}

}
