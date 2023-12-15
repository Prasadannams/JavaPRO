package SessionThree;

public class StudentMain  {

	public static void main(String[] args) {

	
		Student s=new Student();
		s.stdid=109;
		s.stdname="prasad";
		s.subject="selenium"; 
		s.getDetails(110,"durga", "corejava");
		
		
		Student s1=new Student();
		s1.getDetails(120, "silpa", "performance");
		
		Student s2=new Student();
		s2.addMarks(10, 10, 10);
		int total = s2.sub1 + s2.sub2 + s2.sub3;

		System.out.println(total);
		
		
		
		s.display();
		s1.display();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
