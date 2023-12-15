package ConstructorDemo;

public class Constructor {

	
	
	
	
	
	public Constructor() {
		
		this(10);
		System.out.println("print a ");
		
	}
	
	
	
	public Constructor(int i) {
		 this('a');
		 
		System.out.println("print b ");
       
	}
	
	
	

	public Constructor(char c) {
		
		System.out.println("print c ");

	}
	
	
	
	
	public static void main(String[] args) {
		
		System.out.println("print main ");
		Constructor d=new Constructor();
	}




	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	 * public Constructor(String name , int cost , String color)
	 * 
	 * { this("ho","nm"); name = name; this.cost = cost; this.color = color;
	 * 
	 * }
	 * 
	 * 
	 * public Constructor(String name , String color)
	 * 
	 * { this. name = name; this.color = color;
	 * 
	 * }
	 * 
	 * public static void main(String[] args) {
	 * 
	 * Constructor v = new Constructor("reliance" , 90 , "red");
	 * 
	 * System.out.println(v.color); System.out.println(v.cost);
	 * 
	 * 
	 * Constructor v2 = new Constructor("HP" , "BLUE");
	 * 
	 * System.out.println(v2.color); System.out.println(v2.name);
	 * 
	 * }
	 */
	
	
	
	
	
}
