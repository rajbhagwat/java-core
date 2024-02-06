package day17Oct23;

import java.util.Scanner;

public class ScannerWithMatrix {

	public static void main(String[] args) {
		int r=0, c=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of rows:");
		r = sc.nextInt();
		System.out.println("Enter no of cols:");
		c = sc.nextInt();
		int[][] arr = new int[r][c];
		int ele, row=0, col=0;
		System.out.println("Enter array elements:");
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				System.out.println("Enter ele: ");
				arr[i][j]= sc.nextInt();
				
			}
			System.out.println();
		}
		System.out.println("You enterde below array:");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) 
				System.out.println(arr[i][j] + "\t");
			System.out.println();
		}
		sc.close();

	}

}
