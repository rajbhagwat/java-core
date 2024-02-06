package Test25sep23;

public class CountOccrenceNo {

	public static void main(String[] args) {
		int No = 8955589, count = 0;
		int declare = 5;
		while ( No > 0)
		{
			int r = No%10;
			if (r == declare) 
				count++;
			No /=10;
		}
		System.out.println("Occurence No is = " + count);

	}

}
