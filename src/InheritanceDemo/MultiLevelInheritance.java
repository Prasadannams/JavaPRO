package InheritanceDemo;


class A{
	
	void parent (int a,int b ) {
		System.out.println(" print under parent ");
	}
}


class B extends A{
	
	void sub1 (int a,int b ) {
		System.out.println(" print under subclass ");
	}
}


class C extends B{
	
	void sub2 (int a,int b ) {
		System.out.println(" print under subclass2 ");
	}
}






public class MultiLevelInheritance {
	

	public static void main(String[] args) {
		
		
		
		C ref=new C();
		ref.sub2(10, 20);
		ref.sub1(5, 5);
		ref.parent(1, 1);

	}

}
