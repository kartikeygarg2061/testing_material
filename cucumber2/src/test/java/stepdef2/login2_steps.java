package stepdef2;

import org.openqa.selenium.By;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.common_methods;


public class login2_steps extends common_methods{

	
	@When("click on the login link")
	public void logintab() {
		dr.findElement(By.xpath("//div[@class=\"header-links\"]//a[@href = '/login']")).click();
	}
	
	@When("enter username and password")
	public void logindata() {
		dr.findElement(By.id("Email")).sendKeys("aaa987@gmail.com");
		dr.findElement(By.id("Password")).sendKeys("@123321aaa");
	}
	
	@When("click on the login button")
	public void click() {
		dr.findElement(By.xpath("//input[@class='button-1 login-button']"));
	}
	
	@Then("product page is displayed")
	public void display() {
		System.out.println("login success");
	}

}
