package InterviewThree;

public class factorialNum{
	
	public static void main(String[] args) {
		
		// 6! 1 * 2 * 3 * 4 * 5 * 6 
		int num=50;
		long factorial=1;
		
		for ( int i=1; i<=num;i++) {
			
			 factorial = factorial*i;
		}
		
		System.out.println("The factorial value of " + factorial );
	}
	
}