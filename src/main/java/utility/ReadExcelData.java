package utility;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelData {

	public static void main(String[] args) throws Exception     {
		
		//String  filelocation="C:\\Users\\naras\\Documents\\data\\data.xlsx";
	/*	File filelocation = new File("C:\\Users\\naras\\Documents\\data\\data.xlsx");
		FileInputStream fisf = new FileInputStream(filelocation);

		XSSFWorkbook wbook= new XSSFWorkbook(fisf); 
		XSSFSheet sheet=wbook.getSheetAt(0);
		String value=sheet.getRow(1).getCell(1).getStringCellValue(); 
		System.out.println(value);*/
		/*
		 * XSSFRow row=sheet.getRow(1); XSSFCell cell=row.getCell(1); // String value=
		 * cell.getStringCellValue(); System.out.println(value);
		 */
		File src= new File("C:\\Users\\naras\\eclipse-workspace\\Product_Frieght_Adda\\data\\bbbb.xlsx");
		FileInputStream file = new FileInputStream(src);

		// Create a Workbook object
		XSSFWorkbook workbook = new XSSFWorkbook(file);

		// Get the sheet object
		XSSFSheet sheet0 = workbook.getSheetAt(0);
		String aa=sheet0.getRow(1).getCell(1).getStringCellValue();
		System.out.println(aa);
		
		
		// Iterate over the rows and cells
		/*for (Row row : sheet1) {
		    for (org.apache.poi.ss.usermodel.Cell cell : row) {
		        // Retrieve the data from the cell
		        String data = cell.getStringCellValue();
		        System.out.println(data);*/
		    }

		}


