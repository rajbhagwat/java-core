package day14Oct23;

public class Capitalize {

	public static void main(String[] args) {
		char[] arr = {'M','a','d','A','M'};
		//MADAM
//		for (int i = 0; i < arr.length; i++) {
//			if(arr[i] >= 65 && arr[i] <=90);
//			System.out.println(arr[i]);
//			if(arr[i] >= 97 && arr[i] <=122)
//				System.out.println((char) (arr[i]-32));
//		}
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] >= 65 && arr[i]<=90)
				System.out.println((char)(arr[i] + 32));
						if (arr[i] >= 97 && arr[i]<=122)
							System.out.println(arr[i]);
			
		}

	}

}
