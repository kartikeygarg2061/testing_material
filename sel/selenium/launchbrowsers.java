package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class launchbrowsers {

	public static void launch_chrome(String url) {
		WebDriver dr = new ChromeDriver();
		dr.get(url);
		dr.manage().window().maximize();
	}
}
