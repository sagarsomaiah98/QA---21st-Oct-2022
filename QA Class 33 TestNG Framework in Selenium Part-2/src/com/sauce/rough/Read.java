package com.sauce.rough;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Read {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis= new 
				FileInputStream(System.getProperty("user.dir")+"\\src\\com\\sauce\\config\\config.properties");
		
		Properties prop = new Properties();
		prop.load(fis);
		
		String value =prop.getProperty("BROWSER");
		System.out.println(value);
		
		
	//	System.out.println(System.getProperty("user.dir"));

	}

}
