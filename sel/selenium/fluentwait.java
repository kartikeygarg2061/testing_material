package selenium;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class fluentwait {
	public static void main(String[] args) {
		
		WebDriver dr = new ChromeDriver();
		dr.get("https://demowebshop.tricentis.com");
		
		String xp = "xpath()";
		
		Wait<WebDriver> wt = new FluentWait<WebDriver>(dr)
				.withTimeout(Duration.ofSeconds(10)) // maximum time it waits 
				.pollingEvery(Duration.ofSeconds(5)) // checking for the condition (we1) to met after every particular set of time given
				.ignoring(NoSuchElementException.class); // ingonore the mentioned exception for the maximum time given
		
		WebElement we1 = wt.until(ExpectedConditions.elementToBeClickable(By.xpath(xp)));
		we1.click();
	}
}
