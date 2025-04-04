package testNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listener1.class)
public class listener_report {
	
	
	@Test
	public void test1() {
		Reporter.log("executing test1 method");
		
		Assert.assertTrue(true);
	}
	
	@Test
	public void test2() {
		Reporter.log("executing test2 method");
		
		Assert.assertTrue(false);
	}
}
