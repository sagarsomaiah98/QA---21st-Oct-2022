package com.janbask.AbstractExample;

public class Test extends Abs_Ex {

	public static void main(String[] args) {
	
		Test t = new Test();
		t.method1();
		t.method2();
		
	}

	@Override
	public void method1() {
System.out.println("calling method 1 in test class");
		
	}

	@Override
	public void house() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void car() {
		// TODO Auto-generated method stub
		
	}

}
