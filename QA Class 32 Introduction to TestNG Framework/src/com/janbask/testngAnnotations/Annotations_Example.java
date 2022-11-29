package com.janbask.testngAnnotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotations_Example {
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("beforeClass");
		
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("AfterClass");
	}
	
	
	@AfterMethod
	public void after() {
		
		System.out.println("******* Calling after method *******");
	}
	
	@Test
	public void method1() {
		
		System.out.println("calling method 1");
	}
	
	@BeforeMethod
	public void before() {
		
		System.out.println("******* Calling before method *******");
	}
	
	@Test
	public void method2() {
		
		System.out.println("calling method 2");
	}
	
	
	@Test
	public void method3() {
		
		System.out.println("calling method 3");
	}
	

}
