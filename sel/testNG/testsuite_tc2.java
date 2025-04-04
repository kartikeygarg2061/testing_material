package testNG;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class testsuite_tc2 {
	public void test2() {
		WebDriver dr = new EdgeDriver();
		dr.get("https://www.demowebshop.tricentis.com/");
		
		LocalDateTime mydateobj = LocalDateTime.now();
		DateTimeFormatter myformatobj = DateTimeFormatter.ofPattern("dd-mm-yyyy HH:mm:ss");
		String formatteddate = mydateobj.format(myformatobj);
		System.out.println("in test1 - after formatting : " + formatteddate);
	}
}
