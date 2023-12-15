package InterviewFive;

public class ReverseEachWordInString {

	public static void main(String[] args) {

		String s="prasad annams is actor";
		String[] words =s.split(" ");
		String orgValue ="";
		
		for( String word:words) {
		String revString="";	
			for( int i=word.length()-1; i>=0 ;i--) {
				revString =revString+word.charAt(i);
			}
			orgValue = orgValue + revString + " " ;

		}
		
		
		System.out.println(orgValue);		

	}

}
