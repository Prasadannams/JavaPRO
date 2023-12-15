package SetDemo;

import java.util.ArrayList;
import java.util.HashSet;

public class hashSet {

	public static void main(String[] args) {

		
		
		// Set is a interface that will extends collection interface 
		// set will not allow duplicate values
		// set is unorder collections { user can define in order manner }
		// set cannot be accesses using index
		// hashset will store the elements in form of hashing not accessble using index
		// hashset will not allow duplicates
		// linked hashset similar to hashset but will maintain insertion order
		// Treeset will maintain ascending order
		
		
		HashSet<String> values= new HashSet<>();
		
		values.add("prasad");
		values.add("king");
		values.add("actor");
		
//		System.out.println(values);
		
	
	
		
		System.err.println(	values.size());
		
		for( String svalue : values) {
			
			System.out.println(svalue);
		}
		
	
	
	  // convert Hashset to arraylist
		
		
		ArrayList list = new ArrayList(values);
		
		
	
	
	System.out.println(list.get(1));
	
	
	
	
	
	
	
	
	
	
	}
	

}
