package Interface;

public class TestBank {

	public static void main(String[] args) {

		// Coming from second interface 		
		SBIBank sb= new SBIBank();
		sb.UKcharges();
		sb.UKcolor();
		sb.UKintrest();
        
		// Coming from one interface 
		sb.Charges();
		sb.Color();
		sb.interest();
		
		// Coming from class own methods
		sb.Crebitcard();
		sb.Debitcard();
	
	System.out.println(SBIBank.ser_charge);
	System.out.println(SBIBank.uk_charges);

	
	}

}
