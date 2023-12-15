package ScheduleOne;

public class This {

	int x = 5;
	int y = 5;

	public static void main(String[] args) {

		This obj = new This();
		

	}

	public This(int x, int y) {
		
		System.out.println("two integer constructor");

	}

	public This(int x) {
		this("prasad",12);
		System.out.println("one integer constructor");

	}

	public This(String x, int y) {
		this(10,20);
		System.out.println("string and  integer constructor");

	}
	public This() {
        this(20);
		System.out.println("no argument constructor");

	}
	
// this keyword is used to differentate between the local and instance varaible
// this keyword is used to refer current class instance varaiable
// this() is used to call constructors in same class
// this() first statement of the constructor if we write anywhere will get compile time error
// chromedriver is example of constructor if we check it will multiple constrcutirs using this()
}
