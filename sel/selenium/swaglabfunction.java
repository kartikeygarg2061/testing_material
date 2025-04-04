	package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class swaglabfunction {
	
	public static void validlogin(String userid, String password, String checkdata) {
		WebDriver dr = new ChromeDriver();
		dr.get("https://www.saucedemo.com/");
		
		dr.findElement(By.id("user-name")).sendKeys(userid);
		dr.findElement(By.id("password")).sendKeys(password);
		dr.findElement(By.id("login-button")).click();
		
		String s = dr.findElement(By.xpath("//span[@class = 'title']")).getText();
		System.out.println("text is : " + s);
		
		
			if(s.equals(checkdata)) {
				System.out.println("pass");
			}
			else if(!s.equals(checkdata)) {
				System.out.println("fail");
			}
	}
	
	public static void invalidlogin(String userid, String password, String msg) {
		
		WebDriver dr = new ChromeDriver();
		dr.get("https://www.saucedemo.com/");
		
		dr.findElement(By.id("user-name")).sendKeys(userid);
		dr.findElement(By.id("password")).sendKeys(password);
		dr.findElement(By.id("login-button")).click();
		
		String e = dr.findElement(By.xpath("//h3[@data-test='error']")).getText();
		
		if(e.contains(msg)) {
			System.out.println("pass");
		}
		else if(!e.contains(msg)) {
			System.out.println("fail");
		}
	}
}
