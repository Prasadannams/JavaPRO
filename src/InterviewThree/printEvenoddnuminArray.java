package InterviewThree;

public class printEvenoddnuminArray {

	public static void main(String[] args) {


		int a[] = {1,2,3,4,6,8,9};
		int counteven=0;
		int countodd=0;
		
		
		for (int i=0; i<a.length;i++) {
			
			if( a[i]%2==0) {
				System.out.println(" even numbers in array " + a[i]);
				counteven++;

			}
		
		
	}
		
		for (int i=0; i<a.length;i++) {
			
			if( a[i]%2!=0) {
				System.out.println(" odd numbers in array " + a[i]);
				countodd++;

			}
		
		
	}


		System.out.println(counteven);
		System.out.println(countodd);
}
}