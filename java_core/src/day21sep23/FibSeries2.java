package day21sep23;

public class FibSeries2 {
	public static void main(String[] args) {
		genFibSeries(10);
	}
	static void genFibSeries(int counter)
	{
		int a = 0, b = 1, sum = 0, cnt = 0;
		while (cnt < counter)
		{
			System.out.println(a);
			sum = a + b;
			a = b;
			b = sum;
			cnt++;
			
		}
	}

}
