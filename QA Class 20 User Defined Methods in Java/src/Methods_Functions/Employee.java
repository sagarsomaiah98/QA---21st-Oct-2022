package Methods_Functions;

public class Employee {
	
	String name="John";
	int age=40;
	
	public void info() {
		
		double salary=432.12;
		
		System.out.println("Employee has salary of "+salary);
	}

	public static void main(String[] args) {
		
		Employee e = new Employee();
		e.info();
		System.out.println(e.name);
		System.out.println(e.age);

	}

}
