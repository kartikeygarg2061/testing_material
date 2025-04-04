package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demowebshop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver dr = new ChromeDriver();
		dr.get("https://demowebshop.tricentis.com/");
		
		dr.findElement(By.className("ico-login")).click();
		dr.findElement(By.id("Email")).sendKeys("aaa987@gmail.com");
		dr.findElement(By.id("Password")).sendKeys("@123321aaa");
		dr.findElement(By.className("login-button")).click();
		
//		xpath = //a[@class='account']
		
		String s = dr.findElement(By.xpath("//a[@class='account']")).getText();
		System.out.println("text is : " + s);
		
		if(s.equals("aaa987@gmail.com")) {
			System.out.println("login successful");
		}
		else {
			System.out.println("login unsuccessful");
		}
//		dr.findElement(By.className("product-box-add-to-cart-button")).click();
//		dr.findElement(By.id("giftcard_2_RecipientName")).sendKeys("abcd");
//		dr.findElement(By.id("giftcard_2_RecipientEmail")).sendKeys("abcd@gmail.com");
//		dr.findElement(By.id("add-to-cart-button-2")).click();
		
//		dr.findElement(By.xpath("//div[@class = 'block block-category-navigation']/div[2]//a[@href = '/books']']")).click();
	}
//	div[@class = 'block block-category-navigation']/div[2]//a[@href = '/books']

}
