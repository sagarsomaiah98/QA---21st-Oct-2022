package com.janbask.methodOverRiding;
public class Parent {
	String name="Wayne";
	
	public void method1() {
		
		System.out.println("Parent method 1");
	}
	public void method2() {
		
		System.out.println("Parent method 2");
		
	}

	public static void main(String args[]) {
		
		Parent p = new Parent();
		p.method1();
		p.method2();
	}
	
}
