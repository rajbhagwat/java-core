package day12Oct23;

public class ArrayInitialization {

	public static void main(String[] args) {
		
		int[] arr = {11,12,13,14,15};
		System.out.println(arr.length);
		System.out.println("arr -> " +arr);
		
		int i=0;
//		do 
//		{
//			System.out.println("arr[" + i + "]=" + arr[i]);
//			i++;
//		}while(i<arr.length);
		
//		for(int x : arr)
//			System.out.println("x = " + x);
		
		for(int ii : arr) {
			System.out.println("ii = " + ii);
		}
		int [] arr1 = new int [] {10,20,30};
		System.out.println(arr1);  //hascode
		System.out.println(arr1.length);
		System.out.println("Printing Array");
		
		for (int j = 0; j < arr1.length; j++) 
			System.out.println(arr1[j]);
		

	}

}
