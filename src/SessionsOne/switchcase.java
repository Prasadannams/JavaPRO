package SessionsOne;

public class switchcase {

	public static void main(String[] args) {

		int month = 4;

		switch (month) {

				   
		case 1:
			System.out.println(" Jan");
			break;

		case 2:
			System.out.println(" feb");
			break;
		case 3:
			System.out.println(" march");
			break;
		case 4:
			System.out.println(" apr");

			break;
		case 5:
			System.out.println(" may");
			break;
		case 6:
			System.out.println(" jun");  // characters are not allowed in cases
			break;
		case 7:
			System.out.println(" jul");
			break;
		case 8:                          // duplicate cases are not allowed
			System.out.println(" aug");
			break;
			
		default:
			System.out.println(" not matching with months "); // default statement will print when there is no case for statement

			
		}
	}
}