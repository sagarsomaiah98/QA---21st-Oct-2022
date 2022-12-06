package com.janbask.assertionsEx;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class Assertions_Ex {
	
	@Test
	public void assert_ex() {
		
		String name="Angel";
	   
		//assertEquals(name, "Angel");
		assertEquals(name, "Amber","Values Angel & Amber are not matching");
	
		
	}

}
