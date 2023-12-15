package InterviewThree;


public class equalArray {

	public static void main(String[] args) {

		int a[] = { 6, 5, 3 };
		int a1[] = { 1, 2, 3 };
//
//           boolean       status  =  Arrays.equals(a, a1);
//		
//		
//           if ( status == true) {
//        	   
//        	   System.out.println(" Arrays are equal ");
//           }
//           else {
//        	   
//        	   System.out.println(" Arrays are not equal ");
//
//           }

		boolean status = true;

		if (a.length == a1.length) {
			// 5 == 5

			for (int i = 0; i < a.length; i++) {

				if (a[i] == a1[i]) {
					// 1==1
				} 
				else {
					status = false;
				}
			}

		} else {

			status = false;

		}

		if (status == true) {

			System.out.println(" Arrays are equal ");
		}

		else {

			System.out.println(" Arrays are not equal ");

		}

	}

}
