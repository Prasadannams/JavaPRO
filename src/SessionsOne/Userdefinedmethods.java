package SessionsOne;

public class Userdefinedmethods {

	// PRGORAMM STARTS WITH MAIN METHOD
	
	/*
	 * int a=100; String s="HAi" ;
	 */
	public static void main(String[] args)
	{
		
        userdefined(100);
		System.out.println(" Iam main method called by JVM");
		userdefined("hai");
		userdefined("hello",250);
		
		
	}

	
	public static void userdefined(int a)
	{
		
		System.out.println("argument method integer " + a);
	}
	
	public static void userdefined(String s)
	{
		
		System.out.println("argument method String" + s);
			
	}
	
	
	public static void userdefined(String s , int a)
	{
		
		System.out.println("argument method String and integer" + s);
			
	}
	
	


}
