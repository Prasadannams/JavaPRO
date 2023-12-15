package SessionTwo;


// Return type and method name should be same then only we can override
// Method OR is possible during inheritance
// Body should be change in child classes

class bank {

	double rateOfInterest() {

		return 0;

	}
}

class SBI extends bank {

	double rateOfInterest() {
		System.out.println("body different");

		return 90;

	}
}

class ICICI extends bank {

	double rateOfInterest() {

		return 0;

	}
}

public class MethodOverRiding {

	public static void main(String[] args) {

		SBI ref1 = new SBI();
		System.out.println(ref1.rateOfInterest());

	}

}
