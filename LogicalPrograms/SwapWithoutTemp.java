package LogicalPrograms;

public class SwapWithoutTemp {  
    public static void main(String args[]) {  
        String a = "Thank";  
        String b = "You";  
        System.out.println("Before swap: " + a + " " + b);  
        a = a + b;  
       int alength=a.length();
       int blength=b.length();
        b = a.substring(0, alength - blength);  
        a = a.substring(b.length());  
        System.out.println("After : " + a + " " + b);  
    }  
}  
