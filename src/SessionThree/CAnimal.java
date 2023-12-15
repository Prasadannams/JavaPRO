package SessionThree;

public class CAnimal {

	int a=10;
	
	CAnimal (){
		
		System.out.println("print a ");
	}
}

 class stones extends CAnimal {

	int a=20;
	
	 stones(){
		

		 
		System.out.println("print b ");
		System.out.println(super.a);
		
	}
	 
	 stones(char b){
		 
		 System.out.println("print c");
	 }
}
