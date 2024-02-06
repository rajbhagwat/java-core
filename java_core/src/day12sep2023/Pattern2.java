package day12sep2023;

public class Pattern2 {
	
	public static void main(String[] args) 
	{
		for (int r = 'e'; r>='a'; r--) //e d c b a
		{
			for (int c = 'a'; c <=r; c++) // a to a
			
				System.out.print(c);
				System.out.println();
			}
		}
	}

class Pattern3{
	
	public static void main(String[] args) 
	{
		for (int r = 'A'; r>='E'; r++) 
		{
			for (int c = 'A'; c <=r; c++) // a to a
			
				System.out.print(c);
				System.out.println();
			}
		}
	}
	


