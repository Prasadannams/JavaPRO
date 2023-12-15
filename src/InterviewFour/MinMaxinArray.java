package InterviewFour;

public class MinMaxinArray {

	public static void main(String[] args) {

		
		int a[]= {280,100,50,200,250,300};
		int max=a[0];
		int min=a[0];
		
		for( int i=1;i<a.length;i++) {
			
			if(a[i]>max) {
				max=a[i];
			}
		}
		
		System.out.println("Max values in array" + " " + max);
		
		

		for( int i=1;i<a.length;i++) {
			
			if(a[i]<min) {
				min=a[i];
			}
		}
		
		System.out.println("Min values in array" + " " + min);
		
		
		
		
		
		
	}

}
