package mouse_keyboard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouse_hover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver dr = new ChromeDriver();
		dr.get("https://myntra.com");
		
		WebElement menu = dr.findElement(By.xpath("//div[@class='desktop-user']"));
		
		Actions act = new Actions(dr);
		act.moveToElement(menu).perform();
	}

}
