package day18Oct23;

public class ThreeDArray {

	public static void main(String[] args) {
//		int[][][] arr = new int [2][3][4];
		
		int [][][] arr = {
				{
					{1,2,3,4},
					{4,5,6,5},
					{7,8,9,7}
				},
				{
					{11,22,33,44},
					{5,4,3,2},
					{1,2,3,4}
				}
				
		};
//		System.out.println(arr.length);
//		System.out.println(arr[0].length);
//		System.out.println(arr[0][0].length);
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) 
				for (int k = 0; k < arr[i][j].length; k++) {
					System.out.println(arr[i][j][k] + "\t");
					System.out.println();
				}
				System.out.println();
			}
		}

	}


