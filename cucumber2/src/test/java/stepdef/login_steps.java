package stepdef;

import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.common_methods;

public class login_steps extends common_methods {
	String s;
	
	@Given("Login page is displayed")
	public void login_page_is_displayed() {
	   
		launch_chrome("https://www.saucedemo.com/");
		
	}
	
	@When("enter the username and password")
	public void uname_pass() {
		dr.findElement(By.id("user-name")).sendKeys("standard_user");
		dr.findElement(By.id("password")).sendKeys("secret_sauce");
	}
	
	@When("click on the login button")
	public void login() {
		dr.findElement(By.id("login-button")).click();
	}
	
	@When("get text data")
	public void getdata() {
		s = dr.findElement(By.xpath("//span[@class='title']")).getText();
	}
	
	@Then("product page is displayed")
	public void display() {
		if(s.contains("Products")) {
			System.out.println("login success");
		}
		else {
			System.out.println("invalid login");
		}
//		Assert.assertEquals("Products", s);
	}
}
