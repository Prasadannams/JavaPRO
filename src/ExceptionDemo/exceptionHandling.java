package ExceptionDemo;

public class exceptionHandling {
	
	
	
	
	
	// We have two types of exception 
	// Exception is class and we have three types 1. checked 2.unchecked 3.errors ( assertions )
	// 1. Checked exceptions == it will identify by compiler
	// 2. Unchecked exceptions  == cannot be identify by compiler
	// One try block will have multiple exceptions
	// if you don't know the exception name direct write as base class exception  under catch
	// Finally block will always execute even 1. exception occurs ,  2.exception occurs but handled , 3. exception occurs but not handled
	
	
	
	int a,b;
	
	void display () {
		
		System.out.println(a+b);
	}

	public static void main(String[] args) {
		
		String a= "909";
		System.out.println(a.length());
		
		try {
			int value = Integer.parseInt(a);
		}
		catch (NumberFormatException e) {
			//System.out.println(" print under catch");
		}
		
		//System.out.println(value);
		
		exceptionHandling ref= new exceptionHandling();
		ref.a=20;
		ref.b=30;
		ref.display();
		

	}

}
