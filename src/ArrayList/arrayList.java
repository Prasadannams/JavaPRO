package ArrayList;

import java.util.ArrayList;

public class arrayList {

	public static void main(String[] args) {
		
		
		// Collections is group of dynamic data structure  ( store under heap memory )
		// collections in java framework that provides architecture to store and manipulates the group of objects
        //0. List an interface array is the class , arraylist will implement all the methods of list interface
		//1. we can also called arraylist as derived datatype can we call it as collections
		//2. when we dont know the size and we need different datatype then we AL
		//3. Arraylist her size not fixed and we can add any data irrelevant of data type
		//4. ArrayList List = new ArrayList(); Syntax of arraylist irrespective of data type
		//5. Arraylist contains duplicate elements
		//6. Arraylist will store insertion order based on index we can retrieve value
		//7. Arraylist manipulation is slow because lot of shifting required if any element removed from array
		

		// Syntax of fixed data type Generic arraylist
		ArrayList<String> List = new ArrayList<String>(); 

		// it will add data to array list 
		List.add("prasad"); 
		List.add("silpa");
		List.add("20");

		// it will print size of an arraylist
		System.out.println(List.size());

		// it will remove values from an arraylist
		List.remove(1); 
		System.out.println(List);

//		List.add(0, "prashanth"); // it will add values to arraylist
//
//		System.out.println(List);

//		for (int i = 0; i < List.size(); i++) { // print values using normal loop
//
//			System.out.println(" normal loop" +list[ i]);
//		}

		for (Object s : List) { // print values using enhanced loop 2.Object type variable can hold any type of
								// values

			System.out.println(s);
		}

	}

}
