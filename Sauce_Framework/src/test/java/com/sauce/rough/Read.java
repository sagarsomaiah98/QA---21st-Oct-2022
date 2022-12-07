package com.sauce.rough;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Read {

	public static void main(String[] args) throws IOException {
	
		Properties prop = new Properties();
		
		FileInputStream fis= new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\CONFIG\\config.properties");
		prop.load(fis);
		
	String value=prop.getProperty("URL");
	System.out.println(value);
	
	//String path =System.getProperty("user.dir");
	
	//System.out.println(path);
		

	}

}
