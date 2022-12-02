
public class Excel_Read {

	public static void main(String[] args) {
		
	    Xls_Reader xls = new Xls_Reader("S:\\JANBASK\\QA - 21st Oct 2022\\QA Class 31-DATA PAREMERTIZATION\\src\\TEST_DATA\\TESTSUITE.xlsx");
	    
	   int rowCount= xls.getRowCount("GMAIL");
	   System.out.println(rowCount);
	   
	   
	  for( int i=1;i<=rowCount;i++) {
		  
	  
	 String value1=  xls.getCellData("GMAIL", "TCID", i);
	 String value2=  xls.getCellData("GMAIL", "TESTCASE", i);
	 String value3=  xls.getCellData("GMAIL", "STATUS", i);
	 System.out.println(value1+" | "+value2+" | "+value3);
	    
	  }

	}

}
