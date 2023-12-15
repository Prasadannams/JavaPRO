package ArrayDemo;

public class MultiDimensionArray {

	public static void main(String[] args) {
	
		// ------------------ Syntax and fixed two dimenssion array ----------------
		
		
	/*	int a[][]=new int[3][2];
		
		a[0][0]=100;
		a[2][1]=500;
		
		System.out.println(" Number of rows : " +  a.length);  // find rows
		System.out.println(" Number of columns : " +  a[0].length );  */
		
		
		

		// ------------------ Syntax and dynamic two dimenssion array ----------------
			
		
		
		int a[][]= {{100,110,120,130},{200,210,220},{300,310},{500,550}};
		
		
		System.out.println(" Number of rows : " +  a.length);  
		System.out.println(" Number of columns : " +  a[0].length );
		
		
	/*	for ( int i=0 ; i< a.length; i++)
		{
			for ( int j=0; j<a[i].length;j++) {
				System.out.println(a[i][j]);
			}
		} */
	
	
	
	//-------------- enchanced for loop ----------------
	
	   for ( int s[]:a) {
		   
	   
		   for ( int  i:s) {
			   System.out.println(i);
		  
	   }
	
	   }
	
	
	
	
	
	
	
	
	
	
	}
	

}
