package SessionsOne;

public class Swappingoftwonumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 10, b = 20;

		/*
		 * System.out.println("before swap print value of  a " + a);
		 * System.out.println("before swap print value of  b " + b);
		 * 
		 * int temp = a; // a value is a = b; // a value is 20 b = temp;
		 */
		System.out.println("after swap print value of a " + a);
		System.out.println("after swap print value of b " + b);

		a = a + b; // 10+20 = 30 then a=30
		b = a - b; // 30-20 = 10 then b=10
		a = a - b; // 30-10 = 20 then a=10

		System.out.println("after swap print value of  a " + a);
		System.out.println("after swap print value of  b " + b);

	}

}
