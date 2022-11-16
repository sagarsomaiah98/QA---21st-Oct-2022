package com.janbask.inheritanceExample;

public class B extends A {
	double pension=2342.32;
	
	public void factory() {
		
		System.out.println("Child owns a factory");
	}

	public static void main(String[] args) {
		
		B b= new B();
		b.factory();
		System.out.println(b.pension);
		
		b.house();
		b.car();
		System.out.println(b.name);
		System.out.println(b.grade);
	
	}

}
