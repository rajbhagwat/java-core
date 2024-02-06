package day12Oct23;

public class StringArrayDemo {

	public static void main(String[] args) {
		// insertion order is preserved
		String[] strArr = new String[3];
		strArr[0] = "kalpesh";
		strArr[1] = "Tiger";
		strArr[2] = "Raj";
		
		for (int i = 0; i < strArr.length; i++) {
			System.out.println(strArr[i]);
			System.out.println("============================================");
			String[] str = {"Virat", "Rohit", "Hardik", "Skikhar"};
			for(String x : str) {
				System.out.println(x);
				
			}
			//below syntax is invalid
			//[]int ar5 = new int[3];
			
			int[]sr1 = new int[3];
			int ar2[] = new int[3];
			int [    ]ar3 = new int[3];
			int ar4[    ] = new int [3];
			// index cannot be negative
			// object is the super data type and can hold any data type
			Object[] objArr = {"Virat",true, 1.2f, 34.45, 'A', 100};
			System.out.println(objArr);
			for (Object o : objArr) {
				System.out.println(0);
			}
		}

	}

}
