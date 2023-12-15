package InheritanceDemo;



// Interface is blueprint of class
// interface contains only final and static variables
// interface contains abstract methods
// Methods in interface public by default
// Interface support multiple inheritance
// when we want to extend interface from class we need to use implements keyword
// interface to interface possible by using extend keyword
// abstract method only have method definition not body
// We can  create object for interface but we cannot instantiate interface


 interface bike1 {
	
	int a=10;
	
	void model();

}
 interface bike2 extends bike1  {
	
	int b=10;
	
	void model();

}



public class MultipleInheritance implements bike2,bike1{

	
	public void model() {
		
		System.out.println(" Output for done ");
	}
	

	public void model1() {
		
		System.out.println(" Output for child done ");
	}
	
	
	
	public static void main(String[] args) {
		
		
		MultipleInheritance ref= new MultipleInheritance();
		ref.model();
		ref.model1();
		

	}



	
}
