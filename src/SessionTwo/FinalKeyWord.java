package SessionTwo;

public class FinalKeyWord {
	
	
	// when variable name is final we cant change the value will get compile time error
	// When method as final we cant override in child classes will get compile time error
	// when class is final we cant extend those class will get compile time error in child class
	
	 int i=100;
	
	 void  print() {
		
		System.out.println("print a");
	}
	
	

	public static void main(String[] args) {
		
		FinalKeyWord ref=new FinalKeyWord();
		System.out.println(ref.i=200);
//		ref.print();
		
	}

}
