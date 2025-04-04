package zzzzassignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class draganddrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver dr = new ChromeDriver();
		dr.get("https://practice.expandtesting.com/drag-and-drop");
		dr.manage().window().maximize();
		
		WebElement we1 = dr.findElement(By.id("column-a"));
		WebElement we2 = dr.findElement(By.id("column-b"));
		
		Actions act = new Actions(dr);
		
		act.dragAndDrop(we1, we2).perform();
	}	

}
