package InterviewFive;

public class revPositionOfString {

	public static void main(String[] args) {

		String words="prasad is my name";
		String[] word=words.split(" ");
		System.out.println(word);
		String rev=" ";



		for(int i=word.length-1  ; i>=0; i--){
		    rev=rev+" "+word[i];
		}

		System.out.println(rev);
	}

}
