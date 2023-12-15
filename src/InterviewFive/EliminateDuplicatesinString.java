package InterviewFive;

public class EliminateDuplicatesinString {

	public static void main(String[] args) {
		
		EliminateDuplicatesinString obj=new EliminateDuplicatesinString();
		obj.duplicateValues("praaasaaaadfgg");
		obj.duplicateValuesTwo("prassad");


	}

	
	
	
	
	public void duplicateValues(String s) {
		
		int count=0;
		String uniq=" ";
		
		for( int i=0; i<s.length() ; i++) {
			
			char ch = s.charAt(i);
			
			if( s.indexOf(ch)==s.lastIndexOf(ch)) {
				uniq+=ch;
				count++;
				
			}
		}
		
		System.out.println(uniq);
		System.out.println(count);

	}
	

	public void duplicateValuesTwo(String s) {
		
		int count=0;
		String uniq=" ";
		
		for( int i=0; i<s.length() ; i++) {
			
			char ch = s.charAt(i);
			
			if( s.indexOf(ch) !=s.lastIndexOf(ch)) {
				uniq+=ch;
				count++;
				
			}
		}
		
		System.out.println(uniq);
		System.out.println(count);

	}
	
	
	
}
