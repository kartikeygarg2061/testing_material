package assign_stepdef;

import java.awt.Desktop.Action;

import org.apache.velocity.runtime.directive.Parse;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.common_methods;

public class assignstepdef extends common_methods{
	static String s1,s2,s3;
	@Given("login page displayed")
	public void login_page_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("in login functionality");
	}
	
	
	@When("^user enter userid and password$")
	public void login() {
		dr.findElement(By.xpath("//div[@class='header-links']//a[@href = '/login']")).click();
		dr.findElement(By.id("Email")).sendKeys("aaa987@gmail.com");
		dr.findElement(By.id("Password")).sendKeys("@123321aaa");
	}
	
	@When("^user click on the login button$")
	public void click() {
		dr.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
	}
	
	@When("^click on the books link$")
	public void buttonlink() {
		dr.findElement(By.xpath("//div[@class='listbox']//a[@href = '/books']")).click();
	}
	
	
	@When("^click on add to cart button for items$")
	public void addtocart() throws InterruptedException{
		s1 = dr.findElement(By.xpath("//div[@class='item-box'][1]//div[2]//a")).getText();
		dr.findElement(By.xpath("//div[@class='item-box'][1]//input[@value='Add to cart']")).click();
		Thread.sleep(2000);
		
		s2 = dr.findElement(By.xpath("//div[@class='item-box'][3]//div[2]//a")).getText();
		dr.findElement(By.xpath("//div[@class='item-box'][3]//input[@value='Add to cart']")).click();
		Thread.sleep(2000);
		
		s3 = dr.findElement(By.xpath("//div[@class='item-box'][5]//div[2]//a")).getText();
		dr.findElement(By.xpath("//div[@class='item-box'][5]//input[@value='Add to cart']")).click();
		Thread.sleep(6000);
	}
	
	
	@When("^click on the shopping link$")
	public void shopping_link() {
		dr.findElement(By.xpath("//span[@class='cart-qty']")).click();
	}
	
	@When("^update for quantity$")
	public void updatequantity() {
		dr.findElement(By.xpath("//tr[@class='cart-item-row'][1]//td[@class='qty nobr']/input")).clear();
		WebElement we = dr.findElement(By.xpath("//tr[@class='cart-item-row'][1]//td[@class='qty nobr']/input"));
		we.sendKeys("20");
		
		dr.findElement(By.xpath("//input[@name='updatecart']")).click();
	}
	
	@When("^check for value$")
//	public void checkvalue() {
////		dr.findElement(By.xpath("//tr[@class='cart-item-row'][1]//td[@class='qty nobr']/input")).clear();
////		
////		WebElement we = dr.findElement(By.xpath("//tr[@class='cart-item-row'][1]//td[@class='qty nobr']/input"));
////		we.sendKeys("20");
//		String val1 = dr.findElement(By.xpath("//tr[@class='cart-item-row'][1]//td[@class='qty nobr']/input")).getDomProperty("value");
//		Assert.assertEquals(20, val1);
//		
//	}
	
	@When("^delete from cart$")
	public void deleteproduct() {
		dr.findElement(By.xpath("//input[@name='removefromcart']")).click();
		dr.findElement(By.xpath("//input[@name='updatecart']")).click();
	}
	
//	@When("check product")
//	public void check() {
//		String exp = dr.findElement(By.xpath("//td[@class='product']/a[@href='/computing-and-internet']")).getText();
//		Assert.assertEquals(exp, s1);
//		System.out.println("same product");
//	}
	
	@When("^filling shipping details$")
	public void shipping() {
		WebElement we1 = dr.findElement(By.id("CountryId"));
		Select s1 = new Select(we1);
		s1.selectByVisibleText("India");
		
		dr.findElement(By.id("ZipPostalCode")).sendKeys("282007");;
	}
	
	@When("^click on the termsNconditions checkbox$")
	public void checkbox() {
		dr.findElement(By.id("termsofservice")).click();
	}
	
	@When("^click the checkout button$")
	public void checkout() {
		dr.findElement(By.id("checkout")).click();
	}
	
	@When("enter the billing address")
	public void billingaddress() throws InterruptedException {
//		WebElement we = dr.findElement(By.id("BillingNewAddress_CountryId"));
//		Select s = new Select(we);
//		s.selectByVisibleText("India");
//		
//		Actions act = new Actions(dr);
//		
//		WebElement we2 = dr.findElement(By.id("BillingNewAddress_City"));
//		
//		act.sendKeys(we2, "bengaluru")
//		.keyDown(Keys.TAB)
//		.sendKeys("global city")
//		.keyDown(Keys.TAB)
//		.keyDown(Keys.TAB)
//		.sendKeys("282007")
//		.keyDown(Keys.TAB)
//		.sendKeys("1234567890").perform();
		
		dr.findElement(By.xpath("//div[@id='billing-buttons-container']/input[1]")).click();
		Thread.sleep(2000);
		
//		Alert a = dr.switchTo().alert();
//		a.dismiss();
	}
	
	@When("^enter the shipping address$")
	public void shippingaddress() throws InterruptedException {
		dr.findElement(By.id("PickUpInStore")).click();
		dr.findElement(By.xpath("//div[@id = 'shipping-buttons-container']//input[1]")).click();
		Thread.sleep(2000);
	}
	
	@When("^enter the payment method$")
	public void paymentmethod() throws InterruptedException {
		dr.findElement(By.id("paymentmethod_3")).click();
		dr.findElement(By.xpath("//div[@id='payment-method-buttons-container']//input")).click();
		Thread.sleep(2000);
	}
	
	@When("^enter the payment information$")
	public void paymentinformation() throws InterruptedException {
		dr.findElement(By.id("PurchaseOrderNumber")).sendKeys("9876543");
		dr.findElement(By.xpath("//div[@id='payment-info-buttons-container']//input")).click();
		Thread.sleep(2000);
	}
	
	@When("^confirm order$")
	public void confirmorder() throws InterruptedException {
//		dr.findElement(By.xpath("//div[@id='confirm-order-buttons-container']//input")).click();
	}
	
	@Then("order confirmed")
	public void display() {
		System.out.println("order is confirmed");
	}
}
