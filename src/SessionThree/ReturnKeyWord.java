package SessionThree;

public class ReturnKeyWord {
	
	// Return keyword is used for our method should define specific return value
	// return keyword should final statement 
	// One return is in one class
	
	int a;
	int b;
	int c;
	
	
	ReturnKeyWord(int sub, int sub1, int sub2){
			
		a=sub;
		b=sub1;
		c=sub2;
	}
	
	/*int sum() {
		
		int d=a+b+c;
		return d;
	}*/
	
	
	void sum() {
		
		int d=a+b+c;
		System.out.println(d);
		
	}
	
	public static void main(String arg[]) {
		
		
		ReturnKeyWord ref=new ReturnKeyWord(10,20,20);
		ref.sum();
		//System.out.println(s.sum());
		
		
		
	}

	
}
