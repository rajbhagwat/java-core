package day21sep23;

public class FibSeries {

	public static void main(String[] args) {
		int a = 0, b = 1, sum = 0, cnt = 0;
		while (cnt < 10) {
			System.out.println(a);
			sum = a + b;
			a = b;
			b = sum;
			cnt++;
		}

	}

}
