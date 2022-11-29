package com.excel.parameter;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;

import org.apache.poi.ss.usermodel.Workbook;

public class ReadFile {

	public static void main(String[] args) throws FileNotFoundException {
		
	
		
		Xls_Reader xls = new Xls_Reader("S:\\JANBASK\\QA - 19th Aug 2022\\QA Class 31 Writing Selenium Test Cases -3\\src\\TESTDATA\\TESTSUITE.xlsx");
		
		int rowCount=xls.getRowCount("GMAIL");
		System.out.println(rowCount);
		
	//String value=	xls.getCellData("GMAIL", "STATUS", 4);
	
	 
	  
	  for(int i=0;i<=rowCount;i++) 
	  {
		  String value=	xls.getCellData("GMAIL", "TCID", i);
		  String value1=xls.getCellData("GMAIL", "TESTCASE", i);
		  String value2=xls.getCellData("GMAIL", "STATUS", i);
		  
		  System.out.println(value+"  "+value1+" "+value2);
		  
		  
	  }
		
	
	
		
		
	}

}
