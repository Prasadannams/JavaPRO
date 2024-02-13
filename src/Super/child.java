package Super;

public class child extends Base{

	public static void main(String[] args) {
		
		child obj=new child(1);
		


	}

	public child() {
		System.out.println("printing under base class");
	}

	public child(int x) {
		super(10);
		System.out.println("printing under base class two");

	}

	public child(String name) {
		System.out.println("printing under base class three");

	}

}
