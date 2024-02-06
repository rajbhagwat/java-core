package day18Oct23;

public class PassingArrayToMethod {
	static void disp(int[] b)
	{
		for (int i = 0; i < b.length; i++) 
		System.out.println(b[i] + " ");	
		
	}
	static void m1 (int[] arr)
	{
		for (int i = 0; i < arr.length; i++) 
			arr[i] = arr[i] * arr[i]; //for changing array content
		return; // control will send back to its caller
		
	}
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		System.out.println("Original Array Content: ");
		disp(arr);
		m1(arr); // will accept array as a paramter to a method and change all its value
		System.out.println("\nchanged Array content: ");
		disp(arr); // display all elememts from an array
	}
	
}
