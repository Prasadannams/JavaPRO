package SessionThree;

public class Student {
	
	int stdid;
	String stdname;
	String subject;
	int sub1,sub2,sub3;
	
	
	void getDetails (int id,String name, String skills){
		
		stdid =id;
		stdname =name;
		subject =skills;
		
	}
	
	void addMarks(int sub1, int sub2, int sub3) {
		
		this.sub1=sub1;
		this.sub2=sub2;
		this.sub3=sub3;
		
		int total = sub1 + sub2 + sub3;
		
		System.out.println(total);
				
	}
	
	void display() {
		
		System.out.println(stdid +"  "+ stdname +"   " + subject);
	}
	
	

	/*public static void main (String arg[]) {
		
		Student s=new Student();
		s.stdid=109;
		s.stdname="prasad";
		s.subject="selenium";
		
		s.display();
	}*/
}
