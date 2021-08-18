package LogicalPrograms;

public class FibonacciSeries {

	public static void main(String[] args) {

		//0 1 1 2 3 5 8 13 21 34 ....
		
		int num = 20;
		int t1 = 0;
		int t2 = 1;
		
		for(int i = 1; i<=num; i++){
			
			System.out.print(t1+" ");
			int sum = t1 + t2;
			t1 = t2;
			t2 = sum;
		}
		
		
		
	}

}
