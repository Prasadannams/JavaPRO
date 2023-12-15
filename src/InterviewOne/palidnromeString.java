package InterviewOne;

public class palidnromeString {

	public static void main(String[] args) {

		String org="DADs";
		String rev="";
		
		for(int i=org.length()-1;i>=0;i--) {
			
			
			rev=rev+org.charAt(i);
		}
		
		if( org.equals(rev)) {
			
			System.out.println("palidnrome string");
		}
		
		else {
			
			System.out.println("not a paindorme string");
		}
	}
	

}
