package day14Oct23;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//			System.out.print("Enter no1: ");
//		int n1 = sc.nextInt();
//		
//		System.out.print("Enter no2: ");
//		int n2 = sc.nextInt();
//		System.out.print("Enter you name: ");
//		//String name = sc.next(); // will accept only one word
//		String name = sc.nextLine(); 
//		System.out.println("name: "+ name );
		
		System.out.println("Enter your weight: ");
		
		float f = sc.nextFloat();
		System.out.println("You entered weight : " + f);
			sc.close();

	}

}
