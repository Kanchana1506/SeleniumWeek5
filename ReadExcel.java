package week5.day2.classoom;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws IOException {
 
		//wokbook
		XSSFWorkbook wb = new XSSFWorkbook("./Data\\createlead.xlsx");
		
		//sheet
		XSSFSheet sheet = wb.getSheet("sheet1");
		int rowcount = sheet.getLastRowNum();
		short cellcount = sheet.getRow(0).getLastCellNum();
		
		for(int i =1; i<=rowcount;i++ )
		{
			for (int j=0;j<cellcount;j++)
			{
		//get row
		XSSFRow row = sheet.getRow(i);
		
		//get cell
		XSSFCell cell = row.getCell(j);
		
		//read data from cell
		String cellvalue = cell.getStringCellValue();
		System.out.print(cellvalue + " ");
		
		}
			System.out.println(" ");	
		}
		//close the workbook
		wb.close();

	}

}
