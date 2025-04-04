package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class common_methods {
	static WebDriver dr;
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
}
