package assignlistener;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import POM.login_page;
import POM.product_page;
import utilities.common_methods;

@Listeners(listener.class)

public class listener_report extends common_methods {
	login_page lp;
	product_page pp;
	
	@BeforeMethod
	public void bm() {
		launch_chrome("https://www.saucedemo.com/");
		lp = new login_page(dr);
		pp = new product_page(dr);
	}
	
	@AfterMethod
	public void am() {
		dr.close();
	}
	
	@Test
	public void test1() {
		lp.enter_uname("standard_user");
		lp.enter_password("secret_sauce");
		lp.click_login();
		String atitle = pp.get_title();
		Assert.assertEquals("Products", atitle);
	}
	
	@Test
	public void test2() throws InterruptedException {
		lp.enter_uname("standard_user");
		lp.enter_password("secret_sauces");
		lp.click_login();
		Thread.sleep(5000);
		String atitle = pp.get_title();
		Assert.assertEquals("Product1", atitle);
	
	}
}
