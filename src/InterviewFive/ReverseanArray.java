package InterviewFive;


public class ReverseanArray {
	


	public static void main(String[] args) {
	
	  
		int[] a= {1,2,3,4,5};
		System.out.println("The orginal array" );
	
		
		for(int i=0 ; i<=a.length-1; i++) {
			System.out.print( a[i]);			
		}
System.out.println();
System.out.println("The reversed array" );


for(int i=a.length-1 ; i>=0; i--) {
	System.out.print(a[i]);

}
	
	}
}