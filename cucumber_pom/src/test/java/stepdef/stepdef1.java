package stepdef;

import org.openqa.selenium.By;
import org.testng.Assert;

import POM.login_page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.base_class;

public class stepdef1 extends base_class {
	
	login_page lp;
	String we;
	
	@Given("Login page is displayed")
	public void login_page_is_displayed() {
	    launch_chrome("https://www.saucedemo.com/");
	}
	
	@When("enter the username and password")
	public void enter_the_username_and_password() {
		lp = new login_page(dr);
		
		lp.enter_uname("standard_user");
		lp.enter_password("secret_sauce");
	}
	
	
	@When("click on the login button")
	public void click_on_the_login_button() {
	    lp.click_login();
	}
	
	
	@When("get text data")
	public void get_text_data() {
	    we = dr.findElement(By.xpath("//span[@class='title']")).getText();
	}
	
	
	@Then("product page is displayed")
	public void product_page_is_displayed() {
	    Assert.assertEquals(we, "Products");
	}

}
