package ExceptionDemo;

public class checkedException {

	public static void main(String[] args) {
		
		
		// checked exception can handle in two ways
		// by using try / catch block 
		// or throws keywords --- it will at method level
		
		System.err.println(" print a");
		try {
		Thread.sleep(9000);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("print b");

	}

}
