package InheritanceDemo;



class Animal{
	
	void Parent (int a,int b ) {
		System.out.println(" print under parent ");
	}
}

class dog extends Animal{
	
	void child1 (int a,int b ) {
		System.out.println(" print under child 1 ");
	}
}


class cat extends Animal {
	
	void child2 (int a,int b ) {
		System.out.println(" print under child 2 ");
	}
}







public class Hirechrical {

	public static void main(String[] args) {
		 
		cat ref=new cat();
		ref.child2(10, 10);
		ref.Parent(5, 5);
		
		
		
		 
		dog re=new dog();
		re.child1(10, 10);
		re.Parent(5, 5);
		
	}

}
