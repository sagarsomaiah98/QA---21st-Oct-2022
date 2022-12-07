package com.sauce.testbase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class TestBase {
	Properties prop;
	FileInputStream fis;
	
	public static WebDriver driver;
	
	public void intialization() throws IOException 
	
	{
      prop = new Properties();
		
    fis= new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\CONFIG\\config.properties");
	prop.load(fis);
	String browser=prop.getProperty("BROWSER");	
		
	String url=prop.getProperty("URL");
	
	int timeout=Integer.valueOf(prop.getProperty("TIMEOUT"));
	System.out.println(browser);
	System.out.println(url);
    System.out.println(timeout);
    
	switch(browser)
	{
	case "CHROME":
	driver= new ChromeDriver();
	break;
	case "FIREFOX":
	driver=new FirefoxDriver();
	break;
	case "EDGE":
     driver= new EdgeDriver();
     break;
	case "InternetExplorer":
	 driver = new InternetExplorerDriver();
	 break;
	 default:
	 System.out.println("INVALID BROWSER");
	 break;
	
	
	}
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(timeout));
	driver.manage().window().maximize();
	
	driver.get(url);
	
	
	
		
	}

}
