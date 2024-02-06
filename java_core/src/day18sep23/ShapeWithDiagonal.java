package day18sep23;

public class ShapeWithDiagonal {

	public static void main(String[] args) {
		int maxRow = 5;
		int maxCol = 5;
		
		for (int r = 1; r < maxRow; r++) 
		{
			for (int c = 1; c < maxCol; c++) 
			{
				if (r==1 || c == 1 || r == maxRow || c == maxCol || r == c)
					
				System.out.print("* ");
				else
					System.out.print(" ");
					
				}
					System.out.println();
			}

	}

}
