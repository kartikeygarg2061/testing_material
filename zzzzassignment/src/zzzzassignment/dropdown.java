package zzzzassignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver dr = new ChromeDriver();
		dr.get("https://jqueryui.com/selectmenu/");
		
		WebElement we = dr.findElement(By.xpath("//iframe[@class='demo-frame']"));
		dr.switchTo().frame(we);
		
		WebElement we1 = dr.findElement(By.id("speed-button"));
//		we1.click();
		Select s = new Select(we1);
		s.selectByVisibleText("slow");
	}

}
