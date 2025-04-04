package mouse_keyboard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class drag_drop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver dr = new ChromeDriver();
		dr.get("https://www.selenium.dev/selenium/web/mouse_interaction.html");
		
		WebElement we1 = dr.findElement(By.xpath("//*[@id=\'draggable\']"));
		WebElement we2 = dr.findElement(By.xpath("//*[@id=\'droppable\']"));
		
		Actions act = new Actions(dr);
		act.dragAndDrop(we1, we2).perform();
	}

}
