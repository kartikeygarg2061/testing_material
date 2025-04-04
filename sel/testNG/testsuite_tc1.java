package testNG;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testsuite_tc1 {
	
	public void test1() {
		WebDriver dr = new ChromeDriver();
		dr.get("https://www.demowebshop.tricentis.com/");
		
		LocalDateTime mydateobj = LocalDateTime.now();
		DateTimeFormatter myformatobj = DateTimeFormatter.ofPattern("dd-mm-yyyy HH:mm:ss");
		String formatteddate = mydateobj.format(myformatobj);
		System.out.println("in test1 - after formatting : " + formatteddate);
	}
}
