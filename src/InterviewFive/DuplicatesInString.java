package InterviewFive;

public class DuplicatesInString {

	public static void main(String[] args) {

		String s = "praassddd";

		char[] c = s.toCharArray();
		boolean status = false;
		int count=0;

		for (int i = 0; i < s.length(); i++) {

			for (int j = i + 1; j < s.length(); j++) {

				if (c[i] == c[j]) {
					status = true;
					count++;
					System.out.println("Duplicates in string " + c[i]);


				}

			}

		}

		if (status == false) {

			System.out.println("No duplicates in String");
		}
		System.out.println(count);

	}

}
