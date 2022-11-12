package Conditions;

public class Multiple_if {

	public static void main(String[] args) {
		 int age= 92;
         
	        // specified condition inside if statement
	        if (age < 10){
	            System.out.println("Kid");
	        }
	         
	        // specified another condition
	        else if (age >= 13 && age < 20){
	            System.out.println("Teenager");
	        }
	 
	        // specified another condition
	        else if (age >= 25 && age < 50){
	            System.out.println("Adult");
	        }
	         
	        // specified another condition
	        else if (age >= 50 && age < 100){
	            System.out.println("Old age");
	        }
	         
	        // default statement
	        else {
	            System.out.println("Uncategorized");
	        }
	    }
	}
