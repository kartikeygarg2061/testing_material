package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.base_class;

public class login_page extends base_class {
	WebDriver dr;
	@FindBy(xpath="//input[@id=\'user-name\']")
	WebElement uname;
	
	@FindBy(xpath="//input[@id='password']")
	WebElement password;
	
	@FindBy(xpath="//input[@id='login-button']")
	WebElement loginbtn;
	
	public login_page(WebDriver dr) {
		this.dr = dr;
		PageFactory.initElements(dr, this);
	}
	
	public void enter_uname(String un) {
		uname.sendKeys(un);
	}
	
	public void enter_password(String pass) {
		password.sendKeys(pass);
	}
	
	public void click_login() {
		loginbtn.click();
	}
}
