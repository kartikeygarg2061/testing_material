package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class test {
	WebDriver dr ;
	@BeforeClass
	public void launch_chrome() {
		dr = new ChromeDriver();
		dr.get("https://jqueryui.com/checkboxradio");
		dr.manage().window().maximize();
		
		WebElement we = dr.findElement(By.xpath("//iframe[@class='demo-frame']"));
		dr.switchTo().frame(we);
	}
	
	@Test
	public void test1() {
		String s = dr.findElement(By.xpath("//div[@class='widget']//h2[2]")).getText();
		Assert.assertEquals(s, "Checkbox");
	}
}
