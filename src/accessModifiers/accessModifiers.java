package accessModifiers;



// Public 2. private 3. protected 4. default 


// PRIVATE : If we make variables and methods as private we can only access within the class only 
// Not with out the package and class


// DEFUALT : If we don't use any modifiers by default " default " modifier will use
// we can only accessible with in the package 

// PROTECTED : We can accessible within the package and outside package also through inheritance only

// PUBLIC : We can accessible within the package and outside package extend keyword not required



public class accessModifiers {
	
	/*
	 * protected int a=10;
	 * 
	 * protected void pulsar() {
	 * 
	 * System.out.println(" print under private "); }
	 */
	
	
	
	public int b=20;
	
	public void bajaj() {
		
		System.out.println("print under pkg1");
	}
	
	
	
	
	
	
	
	
	
	
	
	
}



