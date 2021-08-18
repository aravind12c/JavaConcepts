package LogicalPrograms;

public class ArmstrongExample {

	public static void main(String[] args)  {  
		int n;
		int num;
		int sum = 0;
       System.out.print("Armstrong numbers from 1 to 1000:  ");
        for(int i = 1; i <= 1000; i++)
        {
            n = i;
            while(n > 0)
            {
                num = n % 10;
                n = n / 10;
                sum = sum + (num * num * num);
               
            }
            if(sum == i)
            {
                System.out.print(i+" ");
            }
            
            sum = 0;
        }
	      
	   }  
	
}
