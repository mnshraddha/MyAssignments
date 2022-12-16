package testNG.Assingments;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Readdata {
	public static String[][] readExceldata(String fileName,String sheetName) throws IOException {
		
		//set the path for workbook
		XSSFWorkbook wb = new XSSFWorkbook("./data/"+fileName+".xlsx");
		//to get the number of rows with data
		
		
		//wb.getSheet("sheet1");//provide sheet name
		XSSFSheet ws = wb.getSheet(sheetName);//provide sheet index
		
		//XSSFSheet ws = wb.getSheetAt(0);//provide sheet index
		
		//Get into  the respective sheet
		int rowNum = ws.getLastRowNum();
		int allnumberOfRows = ws.getPhysicalNumberOfRows();
		System.out.println(allnumberOfRows);
		//to get the number of columns with data
		int cellcount = ws.getRow(0).getLastCellNum();
		//store data in array
		String[][] dataArray = new String[rowNum][cellcount];
		//get into specific row0
		for (int i = 1; i <=rowNum; i++) {
			for (int j = 0; j <cellcount; j++) 
			{
				XSSFRow row = ws.getRow(i);
				XSSFCell cell = row.getCell(j);
				String cellValue = cell.getStringCellValue();
				System.out.println(ws.getRow(i).getCell(j).getStringCellValue());
				dataArray[i-1][j]= cellValue;
			}
		}

		//close the workbook
		wb.close();
		return dataArray;
	}	
		
			
}
