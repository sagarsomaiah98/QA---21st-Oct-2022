package com.excel.parameter;

public class Read {

	public static void main(String[] args) {
		Xls_Reader xls= new Xls_Reader("S:\\JANBASK\\QA - 19th Aug 2022\\QA Class 31 Writing Selenium Test Cases -3\\src\\TESTDATA\\TESTSUITE.xlsx");
		int rowCount=xls.getRowCount("GMAIL");
		System.out.println(rowCount);
		
		System.out.println(xls.getCellData("GMAIL", "TESTCASE", 2));

	}

}
