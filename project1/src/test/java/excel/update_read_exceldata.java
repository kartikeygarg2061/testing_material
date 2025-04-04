package excel;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class update_read_exceldata {

	public static void update_data() throws IOException {
		String filename = "data.xlsx";
		String sheetname = "Sheet1";
		
		FileInputStream fis = new FileInputStream(filename);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh = wb.getSheet(sheetname);
		
		XSSFRow r = sh.getRow(0);
		XSSFCell cell1 = r.getCell(1);
		
		cell1.setCellValue("tata"); //to update the existing data
		
		XSSFCell cell2 = r.createCell(2);
		cell2.setCellValue("infosys");
		
		FileOutputStream fos = new FileOutputStream(filename);
		wb.write(fos);
		fos.close();
		wb.close();
	}
	public static void main(String[] args) throws IOException {
		update_data();
	}
}
