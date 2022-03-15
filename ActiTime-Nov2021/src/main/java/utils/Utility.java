package utils;

import org.openqa.selenium.WebDriver;

public class Utility {
	
	public static void screeshot(WebDriver driver, String testID) {
		
		// code 
			
		// Image name =>  Test + testID + Date&Time
		//  Test101 03-03-2022 08 33 12  
		
	}
	
	public static String getDataFromExcel(String sheet, int row, int cell) {

		String data = "";
//		
//		try 
//		{
//			data = w.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
//		}
//		catch(IlligaleStateExcep  e)
//		{
//			double value = w.getSheet(sheet).getRow(row).getCell(cell).getNumnericCellValue();
//			// how to convert double/integer to string 
//			data = value ;
//		}
//		catch(Exception e)
//		{
//			e.printStackTrace();
//		}
// 
		return data;
	}
	
	

}
