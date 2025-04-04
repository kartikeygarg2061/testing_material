package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class product_page {
	WebDriver dr;
	
	@FindBy(xpath="//span[@class='title']")
	WebElement title;
	
	public product_page(WebDriver dr) {
		this.dr = dr;
		PageFactory.initElements(dr, this);
	}
	
	public String get_title() {
		return title.getText();
	}
}
