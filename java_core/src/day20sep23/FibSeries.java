package day20sep23;

public class FibSeries {

	public static void main(String[] args) {
		int a = 1, b = 1, sum = 0, cnt = 1;
		while (cnt<=10)
		{
			System.out.println(cnt + " : " + a);
			sum = a + b;
			a = b;
			b = sum;
			
			cnt++;
		}
	}

}
