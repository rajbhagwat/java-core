package day12Oct23;

public class ArrayDemo {

	public static void main(String[] args) {
		// Arr is an array variable capable of storing 5 int values
		// 5 * 4 bytes = 20 bytes 
		// fixed size - 5 cells
		// can store only integers
		// by default array cell are initialzed with 0
		// index starts with 0
		
		System.out.println("==================================");
		int[] arr = new int[5];
//		System.out.println(arr[100]);
		
		System.out.println("==================================");
		
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);
//		System.out.println(arr[3]);
//		System.out.println(arr[4]);
		
		System.out.println(arr.length);
		for (int i = 0; i < arr.length; i++)
			System.out.println(arr[i]);
		
		arr[0] = 10;
		arr[0] = 50;
		arr[0] = 40;
		arr[0] = 20;
		arr[0] = 30;
		int i = 0;
		
		while (i<arr.length) // 0 2 3 4 [5]
			System.out.println(arr[i++]);
		
		/*
		float[] arr1 = new float[3];
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		System.out.println(arr1[2]);
		
		char[] arr2 = new char[3];
		System.out.println("***" + arr2[0] + "***");
		System.out.println("***" + arr2[1] + "***");
		System.out.println("***" + arr2[2] + "***");	
		
		boolean[] arr3 = new boolean[3];
		System.out.println("***" + arr3[0] + "***");
		System.out.println("***" + arr3[1] + "***");
		System.out.println("***" + arr3[2] + "***");	
		
		String[] arr4 = new String[3];
		System.out.println(arr4[0]);
		System.out.println(arr4[1]);
		System.out.println(arr4[2]);
*/	

	}

}
