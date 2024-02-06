package day18Oct23;

public class AnonymousArrayDemo {
		static void m1(int[] a)
		{
			for (int i = 0; i < a.length; i++) 
				System.out.println(a[i]+ " ");
		}
		public static void main(String[] args) {
			m1(new int[] {10,20,30,40,50});// anonymous array
		}
	}

