package assign_stepdef;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utilities.common_methods;

public class assignhooks extends common_methods {
	
	@Before
	public void bf() {
		launch_chrome("https:demowebshop.tricentis.com");
	}
	
	
//	@After
//	public void af() {
//		dr.close();
//	}
}
