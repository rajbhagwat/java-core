package day11sep2023;
//import java.util.Iterator;

public class Method3 {
    static boolean checkForPrimeNo(int n)
    {
    	int in = 0;
    	for (int div = 0; div <n/2; div++) 
    	  {
    		if (n%div==0) 
    		{
				in = 1;
				break;
			} 
    	  }
    	if (in == 0) {
			return true;
		}
    	else 
    		return false;
			}
	public static void main(String[] args) {
	 int n = 121;
	 boolean res = checkForPrimeNo(n);
	 if(res) // res == true
		 System.out.println(n + " is a PRIME no");
	 else
		 System.out.println(n + "is NOT a PRIME no");
	}

}
