package InterviewThree;

public class missingNumArray {

	public static void main(String[] args) {

//		Duplicates not allowed
//		Ranage difference should be 1
//		
		
    int a[]= {1,2,3,5,6,7};
    
    
		int sum1=0;
		int sum2=0;
		
		for ( int i=0;i<a.length;i++) {
			
			sum1= sum1+a[i];
			
		}
		
		for ( int i=1; i<=7;i++) {
			
			sum2=sum2+i;
		}
		
	int	missingNumber = sum2-sum1;
	
	System.out.println(" missing number in array " + missingNumber);
		
	}

}
