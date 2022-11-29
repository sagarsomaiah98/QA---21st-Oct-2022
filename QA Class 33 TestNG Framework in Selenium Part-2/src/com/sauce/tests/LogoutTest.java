package com.sauce.tests;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sauce.pages.LoginPage;
import com.sauce.pages.LogoutPage;
import com.sauce.testbase.TestBase;
import com.sauce.util.TestUtil;

public class LogoutTest extends TestBase{
	
	@BeforeMethod
	public void intial() throws IOException {
		intialization();
		
		
	}
	
	@Test
	public void logout() throws IOException {
	LoginPage l = new LoginPage();
	l.login("standard_user", "secret_sauce");
	LogoutPage lo= new LogoutPage();
	lo.logout();
	TestUtil.Screenshot();
		
		
		
	}

	@AfterMethod
	public void teardown() {
		
		driver.quit();
	}
}
