package InterviewOne;

public class reverseNumber {

	public static void main(String[] args) {

		
		int num = 12345;
//		int rev=0;
//		
//		while(num!=0) {
//			
//		rev=	rev*10 + num%10;
//       num = num/10;
//		
//		
//		}
//		
//		System.out.println(rev);

		
		
		
//		StringBuffer sb= new StringBuffer(String.valueOf(num));
//		StringBuffer rev=sb.reverse();
//		System.out.println(rev);
//		
//		
		

		StringBuilder sb1= new StringBuilder(num);
		sb1.append(num);
		StringBuilder rev=sb1.reverse();
		System.out.println(rev);
		
		
		
	}

}
