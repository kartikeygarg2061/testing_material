package excel;

import java.io.IOException;

public class excel_readmain  extends read_exceldata{
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String s = excel_read();
		System.out.println("read data is : " + s);
	}

}
