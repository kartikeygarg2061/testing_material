package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver dr = new ChromeDriver();
		dr.get("https://demowebshop.tricentis.com/");
		
		dr.findElement(By.className("ico-login")).click();
		dr.findElement(By.id("Email")).sendKeys("aaa987@gmail.com");
		dr.findElement(By.id("Password")).sendKeys("@123321aaa");
		dr.findElement(By.className("login-button")).click();
		
//		dr.findElement(By.xpath("//div[@class = 'product-grid home-page-product-grid']//div[@class = 'picture']//a[@href='/25-virtual-gift-card']")).click();
//		dr.findElement(By.id("giftcard_2_RecipientName")).sendKeys("abcd");
//		dr.findElement(By.id("giftcard_2_RecipientEmail")).sendKeys("abcd@gmail.com");
//		dr.findElement(By.id("add-to-cart-button-2")).click();
		
		dr.findElement(By.xpath("//div[@class = 'block block-category-navigation']/div[2]//a[@href = '/books']")).click();
		WebElement we1 = dr.findElement(By.name("products-orderby"));
		Select sel = new Select(we1);
		
		sel.selectByContainsVisibleText("Name: A");
		
		
	}

}
