package day28nov23;

import java.util.Optional;

public class OptionalDemo {

	public static void main(String[] args) {
//		String[] strArr = new String[5];  
//        String lowerString = strArr[1].toUpperCase();  
//        System.out.print(lowerString);  
//        
//        String[] strArr = new String[5];
//        Optional<String> checkNull = Optional.ofNullable(strArr[1]);
//        //check for values present or not
//        if (checkNull.isPresent()) {
//			String lowerString = strArr[1].toUpperCase();
//			System.out.println(lowerString);
//		}else
//			System.out.println("String value is not present");
        
//        String[] str = new String[5];
//        //setting value for 1st index
//        str[1] = "I am learning Java";
//        Optional<String> cNull = Optional.ofNullable(str[1]);
//        // It checks, value is present or not
//        if(cNull.isPresent()) {
//        	String lowerString = str[1].toUpperCase();
//        	System.out.println(lowerString);
//        }else
//        	System.out.println("String value is not present");
        
//        Optional<Integer> op = Optional.of(9455);
//        System.out.println("Optional: " + op);
//        System.exit(0);
        
        try {
			Optional<Integer> op = Optional.of(null);
			System.out.println("Optional: " + op);
		} catch (Exception e) {
			System.out.println("op is null");
			System.out.println(e);
		}
		
     
	}

}
