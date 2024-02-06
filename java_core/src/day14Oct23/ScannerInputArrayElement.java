package day14Oct23;

import java.util.Scanner;

public class ScannerInputArrayElement {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of elements: ");
		
		int no = sc.nextInt();
		int [] number = new int[no];
		int i=0;
		while (no>0) {
			System.out.println("Enter  array elements: ");
			number[i] = sc.nextInt();
			i++;
			no--;
			
		}
		System.out.println("Array contents: ");
		for(int t : number)
			System.out.println(t);
		

	}

}
