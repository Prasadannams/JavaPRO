package InterviewFour;

public class linearsearchArray {

	public static void main(String[] args) {


		int a[]= {1,2,3,4,5,6};
		
		int search = 48;
		
		boolean staus = false;
		for ( int i=0 ; i<a.length; i++) {
			
			if (search == a[i] ) {
				 staus = true;
				System.out.println("Search value is found in array "  +  a[i]);
			}
		}
		
		if ( staus == false) {
			
			System.out.println(" Search value not found in array");
		}
		
	}

}
