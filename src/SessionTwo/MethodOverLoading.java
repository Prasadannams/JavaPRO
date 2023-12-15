package SessionTwo;

public class MethodOverLoading {
	
	
	// When we have same method name with different data type and position of data type

	int a, b,c;

	int sum(int a, int b) {

		this.a = a;
		this.b = b;

		int d = a + b;
		return d;

	}

	int sum(int a, int b, int c) {

		this.a = a;
		this.b = b;
		this.c = c;

		int d = a + b + c;
		return d;

	}

	public static void main(String arg[]) {

		MethodOverLoading ref = new MethodOverLoading();
		System.out.println(ref.sum(20, 30));
		System.out.println(ref.sum(10, 100, 400));

	}

}


