package com.janbask.inheritanceExample;

public class A {
	//global variables
	String name="Wayne";
	char grade='A';
	
	//method 1
	public void house() {
		
		System.out.println("parent owns a house");
	}
	//method 2
	public void car() {
		
		System.out.println("parent owns a car");
	}

	public static void main(String[] args) {
		
		A a = new A();
		a.house();
		a.car();
		System.out.println(a.name);
		System.out.println(a.grade);
		
		
		

	}

}
