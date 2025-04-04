package stepdef2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utilities.common_methods;

public class hooks extends common_methods{
	
//	login2_steps lg;
	@Before
	public void setup() {
		System.out.println("before hook");
		launch_chrome("https://demowebshop.tricentis.com/");
	}
	
	@After
	public void close() {
		dr.close();
		System.out.println("after hook");
	}
}
