package InterviewOne;

public class palindorme {

	public static void main(String[] args) {

		int num=2120;
		int rev=0;
		int org = num;

		while(num!=0) {
			
		rev =	rev*10 + num%10;
		num = num/10;
		
		}
		
	System.out.println(rev);
	System.out.println(num);
		
		if (org==rev) {
			
			System.out.println(" its palindrome a number ");
		}
		else {
			System.out.println("not a pnumber ");
		}
		
	}

}
