package stepdef;

import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.common_methods;

public class login_steps2 extends common_methods{
	@Given("The login page is displayed")
	public void login() {
		launch_chrome("https://www.saucedemo.com/");
	}

	@When("^user enters \"(.*)\" and \"(.*)\"$")
	public void user_enters_and(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
		dr.findElement(By.id("user-name")).sendKeys(string);
		dr.findElement(By.id("password")).sendKeys(string2);
	}
	
	@When("user clicks on login button")
	public void click() {
		dr.findElement(By.id("login-button")).click();
	}
	
	@Then("^The application should display the \"(.*)\"$")
	public void the_application_should_display_the(String string) {
	    // Write code here that turns the phrase above into concrete actions
		String s = dr.findElement(By.xpath("//span[@class='title']")).getText();
		
		if(s.contains(string)) {
			System.out.println("login successful");
		}
		else {
			System.out.println("login unsuccessful");
		}
	}


}