package testNG;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class dataproviderassignment extends common_methods {
	
	static String xp_p1 = "//div[@class = 'inventory_list']/div[";
	int num = 1;
	static String xp_p3 = "]//div[@class='inventory_item_name ']";
	String full_xp;
	
	@BeforeClass
	public void login() {
		launch_chrome("https://www.saucedemo.com/");
		
		dr.findElement(By.id("user-name")).sendKeys("standard_user");
		dr.findElement(By.id("password")).sendKeys("secret_sauce");
		dr.findElement(By.id("login-button")).click();
		dr.manage().window().maximize();
		
	}
	
	@DataProvider(name = "data")
	public Object[] getdata() {
		
		Object[] expecteddata = {
				"Sauce Labs Backpack",
				"Sauce Labs Bike Light", 
				"Sauce Lab Bolt T-Shirt", 
				"Sauce Labs Fleece Jacket",
				"Sauce Labs Onesie",
				"Test.allTheThings() T-Shirt (Red)"
				};
		return expecteddata;
	}
	
	@Test(dataProvider = "data")
	public void testproduct(String expname) {
		
//		SoftAssert sa = new SoftAssert();
		
		full_xp = xp_p1 + num + xp_p3;
		String actname = dr.findElement(By.xpath(full_xp)).getText();
//		sa.assertEquals(actname, expname);
		Assert.assertEquals(actname, expname);
		num++;
	}
	
}
