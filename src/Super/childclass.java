package Super;

public class childclass extends Parentclass{

	int rates=10;
	
	public static void main(String[] args) {
		
		childclass obj = new childclass();
		obj.showRate("prasaaad");
		
	}

    

	public void showRate(String name) {
		
		super.showRate("prasad");
		System.out.println("printing values of child " + name);
		System.out.println("printing values of child " + super.rates);
		System.out.println(rates);

	}

}
