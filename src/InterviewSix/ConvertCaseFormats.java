package InterviewSix;

public class ConvertCaseFormats {

	public static void main(String[] args) {

		
		String word ="pRasAD";
		StringBuffer words= new StringBuffer(word);
		
		for(int i=0; i<=word.length()-1; i++) {
			
			if(Character.isLowerCase(word.charAt(i))) {
			words.setCharAt(i, Character.toUpperCase(word.charAt(i)));	
			}
			else if(Character.isUpperCase(word.charAt(i))) {
				words.setCharAt(i, Character.toLowerCase(word.charAt(i)));
			}
		}
		
		System.out.println(words);
	}

}



