package Abstcration;

public  class TestBank extends USRule {

	
	TestBank(){
		System.out.println("TestBanl --- Constructor child");

	}

public static void main(String[] args) {
		
	TestBank TB = new TestBank();
	TB.charges();
	TB.creditCard();
	TB.intrest();
	
	System.out.println(TB.spl_value=30);

}


void creditCard() {
	System.out.println("Platinum creditcard");
}

@Override
public void charges() {
	System.out.println("cahregs accepetd ");

	
}

	

	

}
