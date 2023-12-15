package Abstcration;

public abstract class  USRule {
	
	// abstract and non abstract methods are available in a abstract class
	// 100% Abstraction are not possible
	// Can create constructor for abstract class
	// if we have one method as abstract, then the complete class will change to abstract class
	// We can't override final methods
	// We can't change the values of final variables
	// Variables in abstract class are not static and final
	
	int spl_value=100;
	
	
	USRule(){
		System.out.println("USRULe --- Constructor Parent");
	}
	
	public  void intrest() {
        System.out.println("Interest from abstract class");
	}
	
	public  abstract void charges() ;
	
	

}
