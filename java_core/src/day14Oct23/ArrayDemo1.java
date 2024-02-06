package day14Oct23;

public class ArrayDemo1 {

	public static void main(String[] args) {
		int[] arr = {5,4,3,2,1};
		 //          0 1 2 3 4
		// objective: 1 2 3 4 5
		System.out.println(arr.length);
		for(int i=arr.length-1; i>=0; i--)
			System.out.print(arr[i] + " ");
		
		// sum of all array elements 
		int sum = 0;
		for (int i : arr) 
			sum = sum + i;
		System.out.println("sum = " + sum);
		
		// multiply all array elements 
		int mult = 1;
		for (int i : arr) 
			mult = mult * i;
		System.out.println("product : " + mult);
		
		// even 
		int r;
		for (int x : arr) 
		{
			if ( (x%2) == 0)
				System.out.print(x + " ");
		}
		System.out.println();
		// 4 2
		// <data type of every cell> <VarName>: <ArrayName/iterable>
		for(int i=arr.length-1; i>=0; i--)
		{
			if (arr[i]%2 ==0)
				System.out.print(arr[i] + " ");
		}
		
		System.out.println("================================");
		
		for(int i=0; i<arr.length; i++)
		{
			if (i%2 ==0)
				System.out.println(i + " : " + arr[i]);
		}
		
		
		
		
		
		
		
		
		
		
		
			
			
			
			
			
			
			
			
			
			
		
	}

}
