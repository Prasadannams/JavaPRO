package SessionSix;

public class StringBufferBuilder {

	public static void main(String[] args) {
		
		
		//StringBuffer and StringBuilder are mutable it will change the value using append keyword
		//StringBuffer thread safety StringBUilder not a thread safety 
		
		

		StringBuffer sbf = new StringBuffer("java");

		StringBuilder sb = new StringBuilder("java");

		sbf.append("developer");

		sb.append("developer");

		System.out.println(sbf);

		System.out.println(sb);
		
		System.out.println(sbf.equals(sb));
		

	}

}

