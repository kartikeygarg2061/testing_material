package zzzzassignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keyboard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver dr = new ChromeDriver();
		dr.get("https://saucedemo.com/");
		
		Actions act = new Actions(dr);
		
		WebElement we = dr.findElement(By.id("user-name"));
		
		act.sendKeys(we, "ASDqwe").perform();
	}

}
