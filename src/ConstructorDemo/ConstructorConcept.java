package ConstructorDemo;

public class ConstructorConcept {

	
	// WE CAN OVER LOAD CONSTRUCTORS 
	// THIS KEYWORD USED TO INITIALIZE LOCAL VARAIBLES TO GLOBAL VARAIABLES THIS.GLOBAL=LOCAL;
	// IT WILL NOT ALLOW RETURN TYPE AND NON STATIC
	// CONSTRUCTOR NAME ALWAYS CLASS NAME
	// CONSTRUCTOR CHAINING IS USED TO CALL ONE CONST FROM ANOTHER CONST WITH IN THE SAME CLASS USING CALL TO THIS keyword 
	
	
	String name;
	int age;
	int weight;
	String languages;

	public ConstructorConcept() {

		System.out.println(" print under const ");
	}

	public ConstructorConcept(int i) {

		System.out.println(" print under const two ");
	}

	public ConstructorConcept(String name , int age, int weight,String languages) {
		
		
		this.name = name ;
		this.age  = age  ;
		this.weight =weight;
		this.languages=languages;
		
		System.out.println(name   + "  "  + age + " " +  weight + " " + languages);
		
		
	}

	public static void main(String[] args) {

		ConstructorConcept obj = new ConstructorConcept();
		ConstructorConcept obj1 = new ConstructorConcept(25);
		ConstructorConcept obj2 = new ConstructorConcept("arun", 25, 90, "English");
		ConstructorConcept obj3 = new ConstructorConcept("ajay", 80, 90, "Telugu");
	}

}
