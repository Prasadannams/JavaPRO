package MapDemo;

import java.util.HashMap;
import java.util.Map;

public class hashMap {

	public static void main(String[] args) {
		
		
		// Map is an interface 
		// Hashmap is used to store the values using key and value format by using arraylist premetive data type its not possible
		// keys can not be duplicate but values can duplicate
		// values not comes in order
		// linkedhasmap will follow inertion order
		// treemap will follow comes as ascending order
		
		// HashMap hm=new HashMap(); // syntax of hashmap
		
		
		HashMap <Integer,String> hm=new HashMap<Integer,String>();
		
		
		// addding pairs into hashmap using put method
		
		hm.put(0, "prasad");
		hm.put(1, "silpa");
		hm.put(2, "sandeep");
		
		System.out.println(hm);
		
		/*
		 * hm.clear(); System.out.println(hm);
		 */
		
		
		// to remove key from hashmap
		hm.remove(1);                    
		System.out.println(hm);
		
		// to replace key and values  from hashmap
		hm.replace(0, "prashanth");     
		System.out.println(hm);
		
		
		// read pairs from hashmap
	   for ( Map.Entry  m :  hm.entrySet()) { 
		   
		   System.out.println(" output for " +   m.getKey() +  " and "     + m.getValue()   );
	   }
		
	}

}
