package Super;

public class Base {
	
// one no argument constructor should be mandatory in base class
// or else will get compile time error in child class
// when we create an object in child class by default parent class default constructor will call
// when we call parameterized constructor then default constructor will not call	
	
	public Base() {
		System.out.println("printing under parent class");
	}

	public Base(int x) {

		System.out.println("printing under parent class construcotro");
	}

	public Base(String name) {
		
		System.out.println("printing under parent class construcotro under string");


	}

}