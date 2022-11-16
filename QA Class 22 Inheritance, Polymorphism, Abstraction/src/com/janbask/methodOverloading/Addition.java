package com.janbask.methodOverloading;

public class Addition {
	
	//METHOD OVERLOADING- SAME METHOD/FUNCTION NAME BUT DIFFERENT ARGUMENTS/PARAMETERS
	
	//method with two integer arguments/parameters
	public void add(int a, int b) {
		int c=a+b;
		System.out.println("Addition of two numbers "+a+" and  "+b+" is "+c);
			
	}
	public void add(int a, int b,int c) {
		int d=a+b+c;
		System.out.println("Addition of thre numbers "+a+" and  "+b+" and "+c+" is "+d);
		
	}
	
	public void add(String v1, int a) {
		
		System.out.println("Adding "+ v1+a);
	}
	public void add() {
		
		
		System.out.println("Addition");
	}

	public static void main(String[] args) {
		
		Addition a = new Addition();
		a.add();
		a.add(20,5);
		a.add(10,2,3);
		a.add(5,3);
		a.add("john",23);
		a.add(2,4,7);
		

	}

}
