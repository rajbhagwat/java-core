package day18sep23;

public class ShapeWithDiagonal1 {

	public static void main(String[] args) {

		   int maxRow = 10;
		   int maxCol = 10;

		   for(int r=maxRow;r>=1;r--)
		   {
		    for(int c=maxCol; c>=1;c--)
		    {
		      if (r==1 || c == 1 || r == maxRow || c == maxCol || (c+r-1) == maxRow)
		          System.out.print("* ");
		      else
		          System.out.print("  ");
		    }
			System.out.println();
		   }
	}

}
