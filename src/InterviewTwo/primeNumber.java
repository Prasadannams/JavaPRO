package InterviewTwo;

public class primeNumber {

	public static void main(String[] args) {

		
		int num=3;
		int count=0;
		
		if(num>1) {
			
			for ( int i=1; i<=num;i++) {
				
				if(  num%i==0 ) {
					count++; // 1 // 2 //10
				}
				  
			}
			
			if (count>2) {
				System.out.println(num + "Not a prime number");
			}
			else {
				System.out.println(num + "Its prime number");
			}
			
		}
		else {
			
			System.out.println(num + "Not a prime number");
		}
		
		
	}

}
