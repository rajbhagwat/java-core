package day18Oct23;

public class VarArgsDemo {
	
	static void add(int b, int...arr)
	{
		int sum = 0;
		for(int i : arr)
			sum = sum + i;
		System.out.println("sum = " + (sum-b));
		System.out.println();
	}
	

	public static void main(String[] args) {
		add(10,  1,2,3,4,5,6);  //sum = 11
		add(1,2,3); //sum = 4
		add(1,2,3,4);//sum = 8
		add(1,2,3,4,5,6,7);//sum = 26
	}
}