package com.janbask.methodOverRiding;
public class Child extends Parent {
	
	String name="Winchester";
	
	//method overriding
	public void method1() {
		
		System.out.println("modifying in child method");
	}

		
	public void method3() {
		System.out.println(" child method 3");
		
	}
	
	public void method4() {
		
		System.out.println("child method 4");
	}
	

	public static void main(String[] args) {
		
		Child c= new Child();
		c.method1();
		c.method2();
		c.method3();
		c.method4();
		System.out.println(c.name);
		
		
	

	}

}
