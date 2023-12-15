package InterviewFive;

import java.util.Scanner;

public class CountWordsInString {

	public static void main(String[] args) {

		Scanner sc = new Scanner( System.in);
		System.out.println(" enter string value");
		String value =sc.nextLine();
		int count=1;
		
		for( int i=0;i<=value.length()-1;i++) {
		
		if((value.charAt(i)==' ') && (value.charAt(i+1)!= ' ')) {
			
			count++;
		}
		
	
		}
		
		System.out.println(count);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
