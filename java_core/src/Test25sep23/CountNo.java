package Test25sep23;

public class CountNo {

	public static void main(String[] args) {
		int no = 3355;
		int OrgNo = no;
		int countDigits = 0;
		
		while (no > 0) {
			no = no / 10;
			countDigits++;
		}
		System.out.println("no of digits in number " + OrgNo +  " is "  + countDigits);
	}

}
