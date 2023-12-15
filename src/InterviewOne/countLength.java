package InterviewOne;

public class countLength {

	public static void main(String[] args) {

		long num = 123004569;
		int count=0;
		
		while ( num>0) {
			
			num =num/10;
			count++;
		}
		
		
		System.out.println(" No of didgirs in number " + count );
	}

 }
