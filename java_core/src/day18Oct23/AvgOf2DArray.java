package day18Oct23;

public class AvgOf2DArray {

	public static void main(String[] args) {
int[][] arr = new int[2][3]; // 0
		
		arr[0][0] = 10;
		arr[0][1] = 20;
		arr[0][2] = 30;
		
		arr[1][0] = 40;
		arr[1][1] = 50;
		arr[1][2] = 64;
		float sum = 0;
		for(int i=0;i<arr.length;i++)
			for (int j = 0; j < arr[i].length; j++) 
				sum = sum + arr[i][j];
		System.out.println("sum : " + sum); //210
		float avg = sum/(arr.length * arr[0].length);
		System.out.println("avg : " + avg);
	}

}
