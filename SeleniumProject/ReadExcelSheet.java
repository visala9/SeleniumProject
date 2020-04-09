package SeleniumProject;

import java.io.File;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;


public class ReadExcelSheet {
	WebDriver driver;

    XSSFWorkbook workbook;

    XSSFSheet sheet;

    XSSFCell cell;


	    public void readExcel(String filePath,String fileName,String sheetName) throws IOException{


	    	 File src=new File("E:\\selenium\\test.xlsx");  

	    	 FileInputStream fis = new FileInputStream(src);

	    	 workbook = new XSSFWorkbook(fis);

	    	 sheet= workbook.getSheetAt(0);
	    	 
	    	 int rowCount = sheet.getLastRowNum()-sheet.getFirstRowNum();
	    	 
	    	 for (int i = 0; i < rowCount+1; i++) {

	    	        Row row = sheet.getRow(i);

	    	  for (int j = 0; j < row.getLastCellNum(); j++) {
	    		  System.out.print(row.getCell(j).getStringCellValue()+"|| ");

	    	        }

	    	        System.out.println();
	    	    } 

	    }}