package mam.ukma.com.util;

public class TestUtil {
	
	public static boolean isSuiteRunnable(Xls_Reader xls, String suiteName){
		//Count the rows from the sheet
				int  rows=xls.getRowCount("TestSuits");
				//use the loop to Iterate each row
				for(int rowNum=2; rowNum<=rows; rowNum++){
					//Extract the value of first column TSID and get the value in string
					String tsid=xls.getCellData("TestSuits", "TSID", rowNum);
					
					//Extract the value of second column and get the value in string
					String runMode=xls.getCellData("TestSuits", "Rummode", rowNum);
					System.out.println(tsid+"---"+runMode);
					if(tsid.equals(suiteName)){
						if(runMode.equals("Y")){
							return true;
						}
						else 
							return false;
					}
								
				}
						
				return false;
			}

	public static boolean isTestRunnable(Xls_Reader xls, String testCase){
		//Count the number of rows and store into the integer
				int rows=xls.getRowCount("TestCases");
				
				//Use the loop to iterate the rows
				for(int rowNum=2; rowNum<=rows; rowNum++){
					//Extract the value of first/second column TCID and get the value in string
					String tcid=xls.getCellData("TestCases", "TCID", rowNum);
					String runMode=xls.getCellData("TestCases", "Runmode", rowNum);
					System.out.println(tcid+"---"+runMode);
					if(tcid.equals(testCase)){
						if(runMode.equals("Y")){
							return true;
						}
						else
							return false;				
					}
				
				}
							
				return false;	
	}
	
	public static Object[][] getData(Xls_Reader xls, String testCase){
		//count the rows and columns from the sheet and store into integer
		int rowCount=xls.getRowCount(testCase);
		int columnCount=xls.getColumnCount(testCase);
		
		//create the object arr and pass the rows and column in it
		Object[][] dataArr=new Object[rowCount-1][columnCount];
		
		//need to read the data starting from 1 row all columns 		
		for(int rowNum=2; rowNum<=rowCount; rowNum++){
			for(int columnNum=0; columnNum<columnCount; columnNum++){
				String data=xls.getCellData(testCase, columnNum, rowNum);
				System.out.println(data);
				dataArr[rowNum-2][columnNum]=data;
			}
		}
		

		return dataArr;
	
	}

}
