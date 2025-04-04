package JSE;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class javscriptexecutor{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver dr = new ChromeDriver();
		dr.get("https://www.saucedemo.com/");
		
		JavascriptExecutor jse = (JavascriptExecutor) dr;
		
		WebElement we1 = dr.findElement(By.id("user-name"));
		jse.executeScript("arguments[0].value = 'standard_user'", we1);
	}

}
