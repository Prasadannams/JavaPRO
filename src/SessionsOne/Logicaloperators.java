package SessionsOne;

public class Logicaloperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=10 ,b=20 ,c=30 , f=30;
	
	boolean B	 = (a>b) && ( b>c); // false && false 
	boolean D	 = (a>b) || ( b>c); // false || false 
	boolean D2	 = (c==f) ;
	boolean D3	 = (c==f) == (a==b) ; // True != false = True
	
	
	
		System.out.println(B);
		System.out.println(D);
		System.out.println(D2);
		System.out.println(D3);
		
		
		
		
		
	}

}
