package zzzzassignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver dr = new ChromeDriver();
		dr.get("https://practice.expandtesting.com/large");
		dr.manage().window().maximize();
		
		String data = dr.findElement(By.xpath("//tr[@class='row-20']//td[10]")).getText();
		System.out.println(data);
	}

}
