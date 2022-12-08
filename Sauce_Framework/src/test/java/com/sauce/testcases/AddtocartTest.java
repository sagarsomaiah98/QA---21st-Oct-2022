package com.sauce.testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sauce.pages.AddtocartPage;
import com.sauce.pages.LoginPage;
import com.sauce.testbase.TestBase;
import com.sauce.testutil.TestUtil;

public class AddtocartTest extends TestBase {
	@BeforeMethod
	public void intial() throws IOException {
		intialization();
		
	}
	@AfterMethod
	public void teardown() {
		driver.quit();
	}

	@Test
	public void addtocart() throws IOException {
		
		LoginPage l= new LoginPage();
		l.login("standard_user", "secret_sauce");
		AddtocartPage a = new AddtocartPage();
		a.addtocart();
		TestUtil.Screenshot();
		
	}

}
