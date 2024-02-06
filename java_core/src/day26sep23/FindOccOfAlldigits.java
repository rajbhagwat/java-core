package day26sep23;

public class FindOccOfAlldigits {

	public static void main(String[] args) {
		int no = 989898, orgNo = no, cnt ;
		for (int i = 0; i <=9; i++) {
			cnt = 0;
			cnt = findNoOfOcc(i, no);
			if (cnt != 0) 
				System.out.println(i + "has occured  " + cnt + " times");
			no = orgNo;
		}

	}
	private static int findNoOfOcc(int ntf, int no)
	{
		int r, cnt=0;
		while (no != 0) {
			r = no % 10;
			if (r == ntf) 
				cnt++;
			no = no / 10;
		}
		return cnt;
	}

}
