package excel;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import java.util.HashMap;
import java.util.Map.Entry;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class student_assignment {
	
	static HashMap<Integer, student_assignconst> map =  new HashMap<>();
	
	static int sid;
	static int maths, phy;
	
	static String filename = "student_assignment.xlsx";
	static String sheet1name = "Sheet1";
	static String sheet2name = "Sheet2";
	public static void read_data() throws IOException {
		
		FileInputStream fis = new FileInputStream(filename);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh = wb.getSheet(sheet1name);
		
		int i=3, j=0;
		while(i<=3) {

			XSSFRow r = sh.getRow(i);
			student_assignconst sd = new student_assignconst((int) r.getCell(j).getNumericCellValue(), (int) r.getCell(j+1).getNumericCellValue(), (int) r.getCell(j+2).getNumericCellValue());
			map.put(sd.sid, sd);
			i++;
		}
	}
	
	public static void write_data() throws IOException {
		FileInputStream fis = new FileInputStream(filename);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh = wb.getSheet(sheet2name);
		
		int i = 1, sid;
		while(i<=3) {
			XSSFRow r = sh.getRow(i);
			sid = (int) r.getCell(0).getNumericCellValue();
			for(Entry<Integer, student_assignconst> x : map.entrySet()) {
				if(x.getKey() == sid) {
					student_assignconst s = x.getValue();
					XSSFCell cell = r.createCell(3);
					cell.setCellValue(s.average());
					FileOutputStream fos = new FileOutputStream(filename);
					wb.write(fos);
					fos.close();
					break;
				}
			}
			i++;
		}
		wb.close();
	}
	
	
	public static void main(String[] args) throws IOException {
		
		read_data();
		write_data();
	}
}
