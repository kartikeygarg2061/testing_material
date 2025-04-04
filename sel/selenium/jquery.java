package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class jquery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver dr = new ChromeDriver();
		dr.get("https://jqueryui.com/");
		
		dr.findElement(By.xpath("//a[@href='https://jqueryui.com/checkboxradio/']")).click();
//		dr.findElement(By.xpath("//*[text()='checkboxradio']"));
//		*[contains(text(), 'radio')];
//		dr.findElement(By.xpath("div[@class = 'widget']/fieldset[2]//label[1]")).click();
		WebElement web1 = dr.findElement(By.xpath("//iframe[@class = 'demo-frame']"));
		dr.switchTo().frame(web1);
		dr.findElement(By.xpath("//label[@for = 'radio-1']/span[1]")).click();
		dr.findElement(By.xpath("//label[@for = 'checkbox-1']/span[1]")).click();
//		dr.findElement(By.xpath("//div[@class = 'widget']/fieldset[2]//label[1]/span[1]")).click();
	}

}


//div[@class = 'widget']/fieldset[2]//label[1]