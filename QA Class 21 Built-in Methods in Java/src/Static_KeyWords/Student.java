package Static_KeyWords;

public class Student {
	static int marks=50;
	static String name="Bruce";
	
	
	public static void stud_info() {
		char grade='C';
		
		System.out.println("Calling stud_info inside Student class");
		
		System.out.println("Grade "+grade);
			
	}
	public static void display() {
		
		System.out.println("calling display method inside Student class");
	}
	
	public static void main(String[] args) {
	
		stud_info();
		display();
		System.out.println(marks);
		System.out.println(name);

	}

}
