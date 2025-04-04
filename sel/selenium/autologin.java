package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class autologin {
	public static void main(String[] args) {
		
		WebDriver dr4 = new ChromeDriver();
		dr4.get("https://www.saucedemo.com/");
		dr4.findElement(By.id("user-name")).sendKeys("standard_user");
		dr4.findElement(By.name("password")).sendKeys("secret_sauce");
		dr4.findElement(By.id("login-button")).click();
		
//		xpath = //span[@class="title"]
		
		String s = dr4.findElement(By.xpath("//span[@class='title']")).getText();
		System.out.println("text read is : " + s);
		
		if(s.equals("Products")) {
			System.out.println("the expected and actual output is same");
		}
		else {
			System.out.println("the expectde and actual output is not same");
		}
	}
}
