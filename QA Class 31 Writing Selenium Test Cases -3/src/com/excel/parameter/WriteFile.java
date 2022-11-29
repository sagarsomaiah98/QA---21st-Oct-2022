package com.excel.parameter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteFile {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// https://poi.apache.org/components/spreadsheet/quick-guide.html
		

Workbook wb = new XSSFWorkbook();

     try (OutputStream fileOut = new FileOutputStream("S:\\JANBASK\\QA - 19th Aug 2022\\QA Class 31 Writing Selenium Test Cases -3\\src\\TESTDATA\\Workbook.xlsx")) {
    	 Sheet s1 = wb.createSheet("T1");
    	 Sheet s2 = wb.createSheet("T2");
    	// Create a row and put some cells in it. Rows are 0 based.
    	   Row row = s1.createRow(2);
    	 row.createCell(1).setCellValue(1.2);
    	  row.createCell(2).setCellValue("welcome");
    	  row.createCell(3).setCellValue(1001);

    	 wb.write(fileOut);
    	 
	}

     System.out.println("end");
}

}