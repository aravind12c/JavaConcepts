package LogicalPrograms;
public class Polyndrome_Using_String_Builder {

	
	 private static boolean isPalindrome(String str) {
	        if (str == null)
	            return false;
	        StringBuilder strBuilder = new StringBuilder(str);
	        
	        return strBuilder.reverse().toString().equals(str);
	   
	    }
	
	
	
	    public static void main( String[] args )
	    {
	    	
	        System.out.println(isPalindrome("civic") );
	       
	    }
	    
	    
	   

}
