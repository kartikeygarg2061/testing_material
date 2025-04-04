package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class implicit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver dr = new ChromeDriver();
		dr.get("https://www.saucedemo.com/");
		dr.manage().window().maximize();
		
		//implicit waits
		
		dr.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
		dr.findElement(By.id("user-name")).sendKeys("abcd");
	}

}
