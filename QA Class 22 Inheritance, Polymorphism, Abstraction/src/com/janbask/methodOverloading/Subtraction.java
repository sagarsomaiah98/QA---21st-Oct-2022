package com.janbask.methodOverloading;

public class Subtraction {

	
	//same method name but different number of arguments/parameters
	
	public void sub(int a ,int b) {
		
		int c=a-b;
		System.out.println("Subtraction of two numbers "+a+" and "+b+" is "+c);
		
		
	}
	
	
	public void sub(int j, int k,int m) {
		
		System.out.println("calling second method");
		
	}
	public static void main(String[] args) {
		
		Subtraction s = new Subtraction();
		
	s.sub(90,20,55);
	s.sub(10, 20);
		

	}

}
