package LogicalPrograms;

//Get the number to check for palindrome
//Hold the number in temporary variable
//Reverse the number
//Compare the temporary number with reversed number
//If both numbers are same, print "palindrome number"
//Else print "not palindrome number"

public class ReverseANumber {

	public static void main(String[] args) {

		int original = 454; ///4321
		int temp;
		int reverse  = 0;
		 temp=original;
		while(temp !=0){
			int n = temp % 10;//getting remainder
			temp = temp/10;	// getting the quotient	
			reverse = reverse * 10 + n; //43 
			 	
		}
		
		
		System.out.println("reversed number is : " + reverse);
		if (original==reverse) {
			System.out.println("It is Polyndrome : " + reverse);
		}
		else {
			System.out.println("It is  not Polyndrome : " + reverse);
		}
		
	}

}
