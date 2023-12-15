package SessionTwo;


public class sBikeSuper {
	
	
	// It is used to refer immediate parent class and instance varaible
	// It is used to Invoke immediate parent class methods
	// it is used to invoke immediate parent class constructor
	// syntax : super.varaibelname super.method name

	
	 String color ="bike";

	  void print (){
		 
		 System.out.println("print under super");
	 }
	 
	}
	

 class bike2 extends sBikeSuper {

	 String color ="red";
	 
	 void print () {
		 
		 System.out.println("print under base");
      	 super.print();
	 }
	
	void display() {
		
		System.out.println(color);
	   System.out.println(super.color);
		
	
	}
	
	
	
	
	
	
	
}