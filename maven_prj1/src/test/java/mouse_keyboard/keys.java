package mouse_keyboard;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver dr = new ChromeDriver();
		dr.get("https://www.saucedemo.com/");
		
		WebElement we1 = dr.findElement(By.xpath("//*[@id=\'user-name\']"));
		
		Actions act = new Actions(dr);
		
		act.sendKeys(we1, "hello!").keyDown(Keys.CONTROL).sendKeys("acvvv").keyUp(Keys.CONTROL).perform();
	}

}
