package InheritanceDemo;



// Extend keyword is used for inheritance
// we can use sub class method in child class
// The class which is acquring properties is subclass
// The class which is acquired properties is parentclass
// Five type inheritance we have 
//1. single level 2. multi-level 3. hirechal 4. hybrid 5. multiple
// 123 with possible using class and extend keyword 45 only possible using implements and interface

class Teacher {

	String designation;
	String Collegename;

	void does() {

		System.out.println("Teaching");
	}
}

class computerTeacher extends Teacher {

	int b;

	void print() {

		System.out.println("Print from sub class");
	}
}

public class InheritanceConcept {

	public static void main(String[] args) {

		computerTeacher ref = new computerTeacher();
		System.out.println(ref.designation = "qa");
		System.out.println(ref.Collegename = "drucare");

		ref.does();
		ref.print();

		System.out.println(ref.b = 100);
	}

}
