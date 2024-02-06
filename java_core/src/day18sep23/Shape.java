package day18sep23;

public class Shape {

	public static void main(String[] args) {
		int maxRow = 7;
		int maxCol = 7;
		
		for (int r = 1; r < maxRow; r++) {
			for (int c = 1; c < maxCol; c++) {
				if (r==1 || r == maxRow || c == maxCol)
				System.out.print("* ");
				else
					System.out.print(" ");
					
				}
					System.out.println();
			}
		}

	}