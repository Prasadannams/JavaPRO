package InheritanceDemo;

class parent {

	void header() {

		System.out.println(" print from header ");
	}
}

interface child1 {

	public void model();

}

interface child2 {

	void model();

}

public class HybridInheritance extends parent implements child1,child2 {
	
	void hyb() {
		
		System.out.println("print under hybrid");
	}

	public void model() {

		System.out.println("print under interface child2");
	}

	void model1() {

		System.out.println("print under interface child1");
	}

	public static void main(String[] args) {
		
		HybridInheritance ref=new HybridInheritance();
		ref.hyb();
		ref.model();
		ref.model1();
		ref.header();

	}

}
