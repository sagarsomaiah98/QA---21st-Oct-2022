package com.sauce.testcases;

public class RunTests {

	public static void main(String[] args) throws InterruptedException {
		
		LoginTest l = new LoginTest();
		l.login("standard_user", "secret_sauce");
		
		
		OrderTest o = new OrderTest();
		o.ordertest();
		
		LogoutTest lo= new LogoutTest();
		lo.logout();
		

	}

}
