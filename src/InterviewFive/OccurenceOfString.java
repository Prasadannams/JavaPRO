package InterviewFive;

import java.util.HashMap;

public class OccurenceOfString {

	public static void main(String[] args) {

		OccurenceOfString.occurence("test data");
	}

	public static void occurence(String s) {
		
		HashMap<Character,Integer> map = new HashMap<>();
		
		char[] characters =s.toCharArray();
		
		for( char sch : characters) {
			if(String.valueOf(sch).isBlank()){
			if( map.containsKey(sch)) {
				
				map.put(sch, map.get(sch)+1);
			}
			else {
				map.put(sch, 1);
			}
		}
		}
		System.out.println(map);

	}

}