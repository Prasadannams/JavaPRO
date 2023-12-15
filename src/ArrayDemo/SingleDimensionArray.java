package ArrayDemo;

public class SingleDimensionArray {

	public static void main(String[] args) {
		
		
		
		
	// ----------------Concept of an array ------------------------------
		
		

		// Array - It means collection homogenious elements which is having same data
		// type.
		// Two types arrays we have 1.single dimension array 2. Multi dimension array
		// datatype varaiblename[]=new datatype[length];
		// System.out.println(a.length);
		// Arrayindexoutofbound exception when we declare more then the array length
        // We can not assign any other values except data type
		
 // --------   Fixed length array ---------------------------------------------------	
		
		int a[] = new int[2];

		a[0] = 100;
		a[1] = 200;
		a[2] = 200;

		
		  for( int i=0;i<a.length;i++){
			  System.out.println(a[i]);
		  }
		
		 for (int i : a)
		 { System.out.println(i);
		

	// ------------------------ Dynamic array length not fixed --------------------------	 
		 
		 
		 
		int b[] = { 100, 200, 210, 310, 410, 510 };

		System.out.println(b[3]);

		System.out.println(b.length);

	// -------------- Normal for loop printing array values and length
		
		
		/* for ( int i=0; i<b.length; i++) 
		 { System.out.println(b[i]); } */
		 
	// -------------- enhanced for loop printing array values and length	 
		 
	/*	for (int i : b) {
			System.out.println(i);  */
		}

	}
}