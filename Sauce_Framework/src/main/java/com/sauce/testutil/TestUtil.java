package com.sauce.testutil;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.sauce.testbase.TestBase;

public class TestUtil  extends TestBase{
public static int random() {
		
		int value= (int) (Math.random()*100000);
		
		return value;
		
		
		
	}
	
public static String DateTime() {
		
		LocalDateTime myDateObj = LocalDateTime.now();
	   
	    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy-HH-mm-ss");

	    String formattedDate = myDateObj.format(myFormatObj);
	    System.out.println("After formatting: " + formattedDate);
	    
	    return formattedDate;
	    
	}

public static  void Screenshot() throws IOException {
	
	
	 String name = driver.getTitle()+"_"+DateTime();

		TakesScreenshot scrShot = ((TakesScreenshot) driver);

		File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
		
		System.out.println(System.getProperty("user.dir") +"\\SCREENSHOTS\\");

		File DestFile = new File(System.getProperty("user.dir") + "\\SCREENSHOTS\\" +  name+".jpeg");

		FileUtils.copyFile(SrcFile, DestFile);
	
	
}

public static void main(String[] args) {
	System.out.println(random());
	System.out.println(DateTime());
	
}
}
