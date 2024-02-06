package Day28Nov23_Streams_OptionalClass;

import java.util.Optional;

public class OPtionalDeom {

	public static void main(String[] args) {
		String[] strArr = new String[5];
		Optional<String> checkNull = Optional.ofNullable(strArr[1]);
		
		 // check for value is present or not
        if(checkNull.isPresent()){    
            String lowerString = strArr[1].toUpperCase();  
            System.out.print(lowerString);  
        }else  
            System.out.println("string value is not present");  
        
        String[] str = new String[5];    
        
		// Setting value for 1st index
		str[1] = "I am learning Java";
        Optional<String> cNull = Optional.ofNullable(str[1]);
        
     // It Checks, value is present or not
        if(cNull.isPresent()){    
            String lowerString = str[1].toUpperCase();  
            System.out.print(lowerString);  
        }else  
            System.out.println("String value is not present");  
        
        try { 
            Optional<Integer> op = Optional.of(null); 
            System.out.println("Optional: "+ op); 
        } 
        catch (Exception e) 
	    { 
        	System.out.println("op is null ");
        	System.out.println(e); 
	    }
	}

}
