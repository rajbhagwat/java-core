package day17Oct23;

public class MatrixAddition {

	public static void main(String[] args) {
		int [] [] ar1 = {
				{1,2},
				{3,4},
				{5,6}
				
		};
			int [][] ar2 = {
					{7,8},
					{9,10},
					{11,12}
			};
			
			int[][] res = new int[3][2];
			for (int r = 0; r <ar1.length; r++) 
				for (int c = 0; c <ar1 [r].length; c++) 
					res[r][c] = ar1[r][c] + ar2[r][c];
			// to display resultatnt matrix
			for (int r = 0; r < res.length; r++) {
				for(int c=0;c<res[r].length;c++)
					System.out.print(res[r][c] + "\t");
				System.out.println();
			}

	}

}
