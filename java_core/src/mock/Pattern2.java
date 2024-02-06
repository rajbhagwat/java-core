package mock;
public class Pattern2{
public static void printPattern (int n) {
	
	for (int i = 0; i <= n; i++) {
		for (int j = 1; j <= i; j++) {
			/*
			 * // if ((i + j) / 2 == 0) { // System.out.println(1 + " "); // } // else // {
			 * // System.out.println(0 + " "); // }
			 */	
			System.out.print( "+");
		}
		System.out.println();
	}
}
	public static void main(String[] args) {
		int n = 5;
		printPattern(n);

	}

}