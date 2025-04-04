package utilities;


import java.io.File;
import java.io.FileInputStream;
//import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class common_methods {
	int userid;
	String username, password;
	protected static WebDriver dr;
	public static void launch_chrome(String url) {
		dr = new ChromeDriver();
		dr.get(url);
	}
	
	public void launch_edge(String url) {
		dr = new EdgeDriver();
		dr.get(url);
	}
	
	public void launch_firefox(String url) {
		dr = new FirefoxDriver();
		dr.get(url);
	}
	
	public void screenshot() throws IOException {
		TakesScreenshot tk = ((TakesScreenshot) dr);
		File srcfile = tk.getScreenshotAs(OutputType.FILE);
	
		File dest = new File("C:\\Users\\kartikey.garg\\Desktop\\img\\error.png");
		FileUtils.copyFile(srcfile, dest);
	}

public static String[][] read_data() throws IOException {
		String filename = "logindata.xlsx";
		String sheetname = "Sheet1";
		
		FileInputStream fis = new FileInputStream(filename);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh = wb.getSheet(sheetname);

	    int rowCount = sh.getPhysicalNumberOfRows();
	    String[][] data = new String[rowCount][2];

	    for (int i = 0; i < rowCount; i++) {
	        XSSFRow row = sh.getRow(i);
	        XSSFCell cell1 = row.getCell(0);
	        XSSFCell cell2 = row.getCell(1);
	        data[i][0] = cell1.getStringCellValue();
	        data[i][1] = cell2.getStringCellValue();
	}
	    return data;
}
}