package day17Oct23;

import day26sep23.MainMethodOverloading;
import day3Oct23.StaticBlockDemo;

public class TwoDArrayDemo {
	static void disp (int[][]arr)
	{
		for (int r = 0; r < arr.length; r++) {
			for (int c = 0; c < arr[r].length; c++) 
				System.out.println(arr[r][c] + "\t");
				System.out.println();
			}
		}
	public static void main(String[] args) {
		int [][] ar = new int[3][2];
		//6 elements
		System.out.print(ar[0][0] + "\t"); 
		System.out.println(ar[0][1]);
		System.out.println(ar[1][0] + "\t");
		System.out.println(ar[1][1]);
		System.out.println(ar[2][0] + "\t");
		System.out.println(ar[0][1]);
		
		System.out.println(ar.length);  //row length
		System.out.println(ar[0].length); // row length
		System.out.println(ar[1].length); // row length
		System.out.println(ar[2].length); // row length
		
		ar[0][0] = 100;
		ar[0][1] = 200;
		
		ar[1][0] = 300;
		ar[1][1] = 400;
		
		ar[2][0] = 500;
		ar[2][1] = 600;
		System.out.println("2D array content: ");
		disp(ar);
	}
		
}

