package zzzzassignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver dr = new ChromeDriver();
		dr.get("https://jqueryui.com/checkboxradio/");
		
		WebElement we = dr.findElement(By.xpath("//iframe[@class='demo-frame']"));
		dr.switchTo().frame(we);
		
		
		dr.findElement(By.xpath("//label[@for='radio-1']//span[1]")).click();
		dr.findElement(By.xpath("//label[@for='checkbox-3']//span")).click();
		dr.findElement(By.xpath("//label[@for='checkbox-4']//span")).click();
	}

}

