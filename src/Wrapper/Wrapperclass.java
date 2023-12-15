package Wrapper;

public class Wrapperclass {

	public static void main(String[] args) {

		 int a =10;
		 System.out.println(a);
		 
		 
		 Wrapperclass obj= new Wrapperclass();
		 obj.sum("123", "234");
	
	}	
		
		
		
		public void sum(String s , String s1) {
			
		int d=	Integer.parseInt(s);
		int e=	Integer.parseInt(s1);
			
			System.out.println(d+e);
			
		}
		
		
		
	

}
