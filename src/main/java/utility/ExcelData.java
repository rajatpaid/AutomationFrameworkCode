package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelData {
	public static void main(String[] args) throws IOException {
        // Create a File object pointing to the Excel file
        File file = new File("C:\\Users\\naras\\eclipse-workspace\\Product_Frieght_Adda\\data\\bbbb.xlsx");

        // Create a FileInputStream object to read from the Excel file
        FileInputStream inputStream = new FileInputStream(file);

        // Create a Workbook object representing the Excel file
        Workbook workbook = new XSSFWorkbook(inputStream);

        // Get the first sheet of the Excel file
        org.apache.poi.ss.usermodel.Sheet sheet = workbook.getSheetAt(1);

        // Iterate over the rows of the sheet
        for (Row row : sheet) {
            // Iterate over the cells of the row
            for (Cell cell : row) {
                // Print the value of the cell
                System.out.print(cell.getStringCellValue() + "\t");
            }
            System.out.println();
        }

        // Close the workbook and input stream
        workbook.close();
        inputStream.close();
    }

}
