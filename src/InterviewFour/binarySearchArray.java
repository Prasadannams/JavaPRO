package InterviewFour;

public class binarySearchArray {

	public static void main(String[] args) {
	
		
		int a[] = {1,2,3,4,5,6,7,8,9};
		
		//1  find mid value
		//2. mid > search values then mid-1
		//3. mid< search value then mid-1
   
		 int search=9;
		
		int h=a.length-1;
		int l =0;
		
		while ( h>l) {
			
			int mid = (l+h) /2  ;
		
			if ( search==a[mid]) {
				System.out.println("seraching value in array is found");
			}
			
			if ( search < a[mid]) {
			l=mid+1;
			
			}
		
			if ( search < a[mid]) {
				h=mid-1;
				
				}
			
		
		
		
		
		
	}

}
}