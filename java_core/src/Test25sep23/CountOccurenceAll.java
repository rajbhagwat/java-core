package Test25sep23;

public class CountOccurenceAll {

	public static void main(String[] args) {
		int No = 8955589, orgNo = No;
		for (int i = 0; i < 10; i++) {
			int ntf = i, r, cnt = 0;
		
		while ( No != 0)
		{
			 r = No%10;
			if (r == ntf) 
				cnt++;
			No = No /10;
		}
		if (cnt != 0) 
		System.out.println(ntf + " has occured " + cnt + "times");
		No = orgNo;

	}

}
}
