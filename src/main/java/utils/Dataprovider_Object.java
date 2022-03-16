package utils;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Dataprovider_Object {
	

	public static Object[][] getData(String dataSheetName) throws IOException {
		

		FileInputStream fis = new FileInputStream("./testData/"+dataSheetName+".xlsx");
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sheet=wb.getSheetAt(0);
		
		int rowCount=sheet.getLastRowNum();
		
		int columnCount=sheet.getRow(0).getLastCellNum();
		
		System.out.println(rowCount);
		
		System.out.println(columnCount);
		
		Object[][] testData= new Object[rowCount][columnCount];
		
		Object cellData = null;
		
		for(int i=1;i<=rowCount;i++) {
			
			XSSFRow row=sheet.getRow(i);
			
			for(int j=0; j<columnCount;j++) {
				
				CellType cell = row.getCell(j).getCellType();
				
				if(cell==cell.STRING) {
				cellData = row.getCell(j).getStringCellValue();
				} else if(cell==cell.NUMERIC) {
					cellData = (int) row.getCell(j).getNumericCellValue();
			}
			System.out.println("The value of rown i: "+i+" and column j: "+j+" is : "+cellData);
			
			testData[i-1][j]=cellData;
			
			}
			
		}

		return testData;
		
	}

}
