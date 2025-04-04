package zzzzassignment;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class rightclick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver dr = new ChromeDriver();
		dr.get("https://practice.expandtesting.com/context-menu");
		dr.manage().window().maximize();
		
		
		WebElement we = dr.findElement(By.id("hot-spot"));
		Actions act = new Actions(dr);
		act.contextClick(we).perform();
		
		Alert a = dr.switchTo().alert();
		String data = a.getText();
		System.out.println(data);
		
		a.accept();		
//		dr.close();
	}

}
