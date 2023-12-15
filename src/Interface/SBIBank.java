package Interface;

public class SBIBank implements USRules, UKRules { //{Multiple inheritance achieved }

	@Override
	public void UKintrest() {
		
		System.out.println("Uk intrest accepted");
	}

	@Override
	public void UKcolor() {
	
		System.out.println("Uk color accepted");

	}

	@Override
	public void UKcharges() {
		
		System.out.println("Uk charges accepted");

	}

	@Override
	public void interest() {
		
		System.out.println(" intrest accepted");

	}

	@Override
	public void Color() {
		
		System.out.println(" color accepted");

	}

	@Override
	public void Charges() {
		
		System.out.println(" charges accepted");

	}
	
	public void Debitcard() {
		System.out.println("platinum debitcard");

	}
	public void Crebitcard() {
		System.out.println("platinum Cebitcard");

	}

	
	
}
