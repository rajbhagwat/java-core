package day14Oct23;

public class CharArray {

	public static void main(String[] args){
			
		char[] chArr = {'P','u','n','e'};
		System.out.println(chArr);
		for(int i=chArr.length-1;i>=0;i--)
			System.out.print(chArr[i]);
		System.out.println();
		char[] chArr1 = {'m','a','d','a','m'};
		System.out.println(chArr1);
		for(int i=chArr1.length-1;i>=0;i--)
			System.out.print(chArr1[i]);
		System.out.println("=====================");
		for(int i=0;i<chArr1.length;i++)
			System.out.print((char) (chArr1[i] - 32));

		
		}	
		
		
	}
