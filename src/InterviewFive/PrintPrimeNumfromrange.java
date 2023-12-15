package InterviewFive;


class PrintPrimeNumfromrange
{
   public static void main (String[] args)
   {	
	  // int primecount=0;
	   for(int i=1; i<=30; i++) {
		   int count=0;
		   
		   for( int j=2; j<i; j++) {
			   if(i%j==0) {
				   count=1;
			   }
		   }
		   
		   if(count==0) {
	//		   primecount++;
			   System.out.println("prime numbers are " + i);
		   }
	   }
	   
	   
	   
	//   System.out.println(primecount);
	   
	   
	   
	   
   }
}