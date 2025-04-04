package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class compatibility {
	
	private String browser;
	WebDriver dr;
	
	public compatibility(String browser) {
		this.browser = browser;
	}
	
	@Test
	public void testmehthod() {
		switch(browser) {
		case "chrome" :
			dr = new ChromeDriver();
			dr.manage().window().maximize();
			break;
		
		case "edge" :
			dr = new EdgeDriver();
			dr.manage().window().maximize();
			break;
		
		case "firefox" :
			dr = new FirefoxDriver();
			dr.manage().window().maximize();
		}
	}
	
	@AfterMethod
	public void launch() {
		dr.get("https://www.saucedemo.com/");
		dr.findElement(By.id("user-name")).sendKeys("standard_user");
		dr.findElement(By.id("password")).sendKeys("secret_sauce");
		dr.findElement(By.id("login-button")).click();	
	}
	
	@Factory
	public static Object[] browsers() {
		Object[] brw = {
				new compatibility("chrome") ,
				new compatibility("edge") ,
				new compatibility("firefox") ,
		};
		return brw;
	}
}
