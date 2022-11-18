package Static_KeyWords;

public class Stud {

	static int marks=90;
	static String name="Kevin";
	
	public static void stud_info() {
		char grade='C';
		
		System.out.println("Calling stud_info");
		
		System.out.println("Grade "+grade);
			
	}
	public  void display() {
		
		System.out.println("calling display method");
	}
	

	public static void main(String[] args) {
	
		stud_info();
		Stud s = new Stud();
		s.display();
		
	
	
	
	System.out.println(marks);
	System.out.println(name);
		
		
		
	}

}