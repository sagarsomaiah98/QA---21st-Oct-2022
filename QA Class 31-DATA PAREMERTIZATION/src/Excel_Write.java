import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Write {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		Workbook wb = new XSSFWorkbook();
		
		try (OutputStream fileOut = new FileOutputStream("S:\\JANBASK\\QA - 21st Oct 2022\\QA Class 31-DATA PAREMERTIZATION\\src\\TEST_DATA\\Test.xlsx")) {
		  
			Sheet sheet1 = wb.createSheet("Sheet A");
			Sheet sheet2 = wb.createSheet("Sheet B");
			Row r1 = sheet2.createRow(4);
			Row r2 = sheet2.createRow(5);
			Row r3 = sheet2.createRow(6);
			Cell c1 = r1.createCell(3);
			Cell c2 = r2.createCell(3);
			Cell c3 = r3.createCell(3);
			
			c1.setCellValue(720);
			c2.setCellValue(45.23);
			c3.setCellValue("Selenium");
			
			wb.write(fileOut);
		    System.out.println("end");
		    
			/*
			 * Assignment - create a excel file with 10 sheets fill the excel with 10 rows
			 * and 10 columns
			 */
		    
		}

	}

}
