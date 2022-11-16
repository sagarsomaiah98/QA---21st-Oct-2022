package Variables;

public class Employee {
	String role="manager";//global variables
	double salary=521.36;//global variables
	
//local variable scope is only inside the function/method
	//local variable cannot be called outside the function/method
	public void emp_info() {
		
		int age=30; //local variable
		String name="john";//local variable
		
		System.out.println("calling employee info ->"+age+" "+name);
		System.out.println(role);
		System.out.println(salary);
		
	}
	
	public void emp_medi() {
		
		int medi_no=2341;//local variable
		String plan="Basic"; //local variable
		System.out.println("calling medi info-> "+medi_no+" "+plan);
		System.out.println(role);
		System.out.println(salary);
	//	System.out.println(age);
	//	System.out.println(name);
		
	}

	public static void main(String[] args) {
		Employee n = new Employee();
		//n.emp_medi();
		System.out.println(n.role);
		System.out.println(n.salary);
		
		
		
		

	}

}
