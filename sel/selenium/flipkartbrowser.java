package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkartbrowser {
	public static void main(String[] args) {
		WebDriver dr1 = new ChromeDriver();
		dr1.get("https://flipkart.com/");
		
	}
}
