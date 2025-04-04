package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class multiplewindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver dr = new ChromeDriver();
		dr.get("https://practice.expandtesting.com/windows");
		dr.manage().window().maximize();
		
		String str = dr.getWindowHandle();
		dr.findElement(By.xpath("//a[@href='/windows/new']")).click();
		
		
		int i=1;
		
		for(String h : dr.getWindowHandles()) {
			dr.switchTo().window(h);
			String title = dr.getTitle();
			System.out.println("window " + i + " title is " + title);
			i++;
		}
		dr.switchTo().window(str);
//		dr.findElement(By.xpath("//li[@class='breadcrumb-item']/a[@href='/']")).click();
	}

}
