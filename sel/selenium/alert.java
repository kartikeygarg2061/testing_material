package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver dr = new ChromeDriver();
		dr.get("https://demoqa.com/alerts");
		dr.manage().window().maximize();
		
		dr.findElement(By.id("alertButton")).click();
		
		try {
			Thread.sleep(3000);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		Alert a = dr.switchTo().alert();
		String alertmsg = a.getText();
		System.out.println("alert msg is : " + alertmsg);
		
		a.accept(); // click on ok button
//		a.dismiss(); // click on cancel button
		
	}

}
