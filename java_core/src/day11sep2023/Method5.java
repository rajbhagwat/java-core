package day11sep2023;

public class Method5 {

	public static void main(String[] args) {
      int n = 29, sum = 0; // 6 is perfect
      for (int div = 1; div < n; div++) 
    	  if (n % div == 0)
    		  sum = sum + div;
      if (sum == n)
    	  System.out.println(n + "is a PERFECT no");
      else
    	  System.out.println(n + "is NOT a PERFECT no");
	}

}
