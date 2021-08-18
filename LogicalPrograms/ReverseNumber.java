package LogicalPrograms;
public class ReverseNumber {

	public static void main(String[] args) {

		 int r,sum=0,temp;    
		  int n=453;//It is the number variable to be checked for palindrome  
		  
		  temp=n;    
		  while(n>0){ 
			  System.out.println("N value " + n); 
			  
		   r=n%10;  //getting remainder 
		   System.out.println("First we have to divide the n by 10 and get the remainder r =" +r); 
		   
		   sum=(sum*10)+r;    
		   System.out.println("Then we have to  multiply the sum with 10 and add the remainder value with it to store in Sum =" +sum);
		   
		   
		   
		   n=n/10;     // getting the quotient
		   System.out.println("Then  we need to divide the n value with 10 and store it in 10  n=" +n);
		    
		   
		  } 
		  System.out.println("Reversed number " +sum);  
		  if(temp==sum)    
		   System.out.println("palindrome number ");    
		  else    
		   System.out.println("not palindrome");   
    }
}
