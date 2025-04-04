package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class dependency {
	@Test
	public void login() {
		System.out.println("in login method");
		Assert.assertEquals(true, false);
	}
	
	@Test(dependsOnMethods = "login")
	public void verifyDashboard() {
		System.out.println("dashboard verification passed");
	}
	
}
