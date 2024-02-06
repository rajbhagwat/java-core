package Test25sep23;

public class Class3 {

	public static void main(String[] args) {
		int no = 37755;
		int orgNo = no;
		int r,d;
		while(no!=0)
		{
			r  = no%10;
			no = orgNo;
			int counter =0;
			while(no!=0)
			{
				
				d = no%10;
				if(r==d)
				{
					counter++;
					System.out.println(r + " " + counter);
					
				}
				else {
					System.out.println("1"+d);

				}
				no = no/10;
				
			}
			
			
			
		}
		
		
		
		
	}
}
