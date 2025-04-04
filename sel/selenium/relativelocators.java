package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.support.locators.RelativeLocator;

public class relativelocators extends common_methods{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch_chrome("https://www.saucedemo.com/");
		
		By emaillocator = RelativeLocator.with(By.tagName("input")).above(By.id("password"));
		dr.findElement(emaillocator).sendKeys("standard_user");
		
		By passwordlocator = RelativeLocator.with(By.tagName("input")).below(By.id("user-name"));
		dr.findElement(passwordlocator).sendKeys("secret_sauce");
	}

}
