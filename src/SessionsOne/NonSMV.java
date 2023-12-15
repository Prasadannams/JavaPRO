package SessionsOne;

public class NonSMV {

	static String name = "prasad";
	int age = 25;

	public static void main(String[] args) {
		String name = " bablu";
		System.out.println(name); // Directly
		System.out.println(NonSMV.name); // Using class name
		System.out.println(name);

		// System.out.println(ref.name); // Not preferable

		NonSMV ref = new NonSMV();

		ref.two();
		NonSMV.one();

	}

	public static void one() {

		System.out.println("static method ");

	}

	public void two() {

		System.out.println(name);

		System.out.println(" non statis method");

	}
}
