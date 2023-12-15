package SessionsOne;

public class forlooppractise {

	public static void main(String[] args) {

		// Initialize value in variable

		/*
		 * String s= " java";
		 * 
		 * for ( int i=1; i<=5; i++)
		 * 
		 * {
		 * 
		 * System.out.println("s"); }
		 * 
		 */

		// printing method value
		/*
		 * for (int i=1; i<=5 ; i++)
		 * 
		 * {
		 * 
		 * System.out.println(" Java five times "); }
		 * 
		 */

		// DISPLAY NUMBERS FROM 1 TO 5
		/*
		 * int n=5; for (int i=1; i<=n; i++) { System.out.println(i); }
		 */

		// DISPLAY SUM OF NATURAL NUMBERS

		/*
		 * int sum = 0;
		 * 
		 * for (int i = 1; i <= 1000; ++i) { sum = sum+i;
		 * 
		 * }
		 * 
		 * { System.out.println(" sum equal to " + sum); }
		 */

		// PRINT ALL EVEN NUMBERS FROM 1 TO 25
		/*
		 * for (int i=1 ; i<=25; i++) {
		 * 
		 * if ( i%2==0) {
		 * 
		 * System.out.println(i); } }
		 */

		/*
		 * // PRINT ALL EVEN NUMBERS DIVISBLE BY 5 IN BETWEEN 1 TO 35
		 * 
		 * 
		 * for ( int i=1; i<=35 ; i++) { if (i%5==0) { System.out.println(i); }
		 * 
		 * }
		 */

		/*
		 * // print all numbers from 1 to 100 excluding multiple of 7
		 * 
		 * for ( int i=1; i<=100;i++) {
		 * 
		 * if (i%7!=0)
		 * 
		 * {
		 * 
		 * System.out.println(i); }
		 * 
		 * }
		 */
		
		
		
		//COUNT ALL NUMBERS FROM 1 TO 50 WHICH IS DIVISBLE BY 5
		
		int count = 0;

		for (int i = 1; i <= 100; i++)

		{
			if (i % 5 == 0)

			{

				count++;
				System.out.println(" count of numbers " + count);

			}

		}
		
		
		
	}
}