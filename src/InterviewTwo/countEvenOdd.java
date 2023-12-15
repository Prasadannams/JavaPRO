package InterviewTwo;

public class countEvenOdd {
	public static void main(String[] args) {
		int n = 2222;
		int countEven = 0;
		int countOdd = 0;
		
		while(n>0) {
	     	int rem=n%10;
			if(rem%2 == 0) {
				countEven++;
			} else {
	
				countOdd++;
			}
			n = n/10;
		}
		System.out.println("Count Even : "+countEven);
		System.out.println("Count Odd : "+countOdd);

	}

}
