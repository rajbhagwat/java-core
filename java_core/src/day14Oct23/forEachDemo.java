package day14Oct23;

public class forEachDemo {

	public static void main(String[] args) {
		
//		String[] arr = {"Virat","Kapil","Sachin","Dhoni","Suresh"};
//		for(String x : arr)
//			System.out.println(x + " ");
//		
//		//Define array of Object which can hold different data types at a time
//		Object[]  arr = {"Virat", 11, 1.2f, 4.56, 'A', true};
//		for (Object x : arr) 
//			System.out.println(x);
		
		String[] arr = {"Virat","Kapil","Sachin","Dhoni","Suresh"};
		int ind = 0;
		for(String str : arr)
		{
			if(ind >= 2)
				System.out.println(str + " ");
			ind++;
			
		}
		System.out.println("----------------------------------");
		ind = 0;
		for (String str : arr)
		{
			ind++;
			if(ind < 3)
				continue;
			System.out.println(str + " ");
		}

	}

}
